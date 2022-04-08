package org.apache.skywalking.apm.plugin.jdbc.db2.define;

import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.matcher.ElementMatcher;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.ConstructorInterceptPoint;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.InstanceMethodsInterceptPoint;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.ClassInstanceMethodsEnhancePluginDefine;
import org.apache.skywalking.apm.agent.core.plugin.match.ClassMatch;
import org.apache.skywalking.apm.agent.core.plugin.match.HierarchyMatch;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class T4ConnectionInstrumentation extends ClassInstanceMethodsEnhancePluginDefine {


    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[]{
                new InstanceMethodsInterceptPoint() {
                    @Override
                    public ElementMatcher<MethodDescription> getMethodsMatcher() {
                        return named(org.apache.skywalking.apm.plugin.jdbc.define.Constants.CREATE_STATEMENT_METHOD_NAME);
                    }

                    @Override
                    public String getMethodsInterceptor() {
                        return Constants.CREATE_STATMENT_CLASS;
                    }

                    @Override
                    public boolean isOverrideArgs() {
                        return false;
                    }
                },
                new InstanceMethodsInterceptPoint() {
                    @Override
                    public ElementMatcher<MethodDescription> getMethodsMatcher() {
                        return named(org.apache.skywalking.apm.plugin.jdbc.define.Constants.COMMIT_METHOD_NAME)
                                .or(named(org.apache.skywalking.apm.plugin.jdbc.define.Constants.ROLLBACK_METHOD_NAME))
                                .or(named(org.apache.skywalking.apm.plugin.jdbc.define.Constants.CLOSE_METHOD_NAME));
                    }

                    @Override
                    public String getMethodsInterceptor() {
                        return org.apache.skywalking.apm.plugin.jdbc.define.Constants.SERVICE_METHOD_INTERCEPT_CLASS;
                    }

                    @Override
                    public boolean isOverrideArgs() {
                        return false;
                    }
                },
                new InstanceMethodsInterceptPoint() {
                    @Override
                    public ElementMatcher<MethodDescription> getMethodsMatcher() {
                        return named("prepareStatement");
                    }

                    @Override
                    public String getMethodsInterceptor() {
                        return Constants.CREATE_PREPARED_STATEMENT_INTERCEPTOR;
                    }

                    @Override
                    public boolean isOverrideArgs() {
                        return false;
                    }
                },
                new InstanceMethodsInterceptPoint() {
                    @Override
                    public ElementMatcher<MethodDescription> getMethodsMatcher() {
                        return named(org.apache.skywalking.apm.plugin.jdbc.define.Constants.PREPARE_CALL_METHOD_NAME);
                    }

                    @Override
                    public String getMethodsInterceptor() {
                        return Constants.CREATE_CALLABLE_STATEMENT_INTERCEPTOR;
                    }

                    @Override
                    public boolean isOverrideArgs() {
                        return false;
                    }
                }
        };
    }

    @Override
    protected ClassMatch enhanceClass() {
        return HierarchyMatch.byHierarchyMatch("com.ibm.db2.jcc.DB2Connection");
        // return byMultiClassMatch("com.ibm.db2.jcc.t4.b", "com.ibm.db2.jcc.t4.T4XAConnection", "com.ibm.db2.jcc.uw.UWConnection");
    }
}
