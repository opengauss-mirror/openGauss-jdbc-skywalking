package org.apache.skywalking.apm.plugin.jdbc.db2.define;

public class Constants {
    public static final String WITNESS_DB2_CLASS = "com.mysql.cj.interceptors.QueryInterceptor";

    public static final String STATMENT_CLASS = "org.apache.skywalking.apm.plugin.jdbc.db2.StatementExecuteMethodsInterceptor";

    public static final String PREPARED_STATMENT_CLASS = "org.apache.skywalking.apm.plugin.jdbc.db2.PreparedStatementExecuteMethodsInterceptor";

    public static final String CREATE_STATMENT_CLASS = "org.apache.skywalking.apm.plugin.jdbc.db2.CreateStatementInterceptor";

    public static final String CREATE_PREPARED_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.db2.CreatePreparedStatementInterceptor";

    public static final String CREATE_CALLABLE_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.db2.CreateCallableStatementInterceptor";

    public static final String CREATE_STATEMENT_INTERCEPTOR = "";

    public static final String SET_CATALOG_INTERCEPTOR = "";
}
