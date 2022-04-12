/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.plugin.jdbc.connectionurl.parser;

import org.apache.skywalking.apm.network.trace.component.ComponentsDefine;
import org.apache.skywalking.apm.network.trace.component.OfficialComponent;
import org.apache.skywalking.apm.plugin.jdbc.trace.ConnectionInfo;

public class DB2UrlParser extends AbstractURLParser {

    private static final int DEFAULT_PORT = 50000;
    private String dbType = "DB2";
    private OfficialComponent component = ComponentsDefine.DB2_JDBC_DRIVER;

    public DB2UrlParser(String url) {
        super(url);
    }

    @Override
    protected URLLocation fetchDatabaseHostsIndexRange() {
        int hostLabelStartIndex = url.indexOf("//");
        int hostLabelEndIndex = url.indexOf("/", hostLabelStartIndex + 2);
        if (hostLabelEndIndex == -1) {
            hostLabelEndIndex = url.indexOf("?", hostLabelStartIndex + 2);
        }
        return new URLLocation(hostLabelStartIndex + 2, hostLabelEndIndex);
    }

    @Override
    protected URLLocation fetchDatabaseNameIndexRange() {
        int databaseStartTag = url.lastIndexOf("/");
        int databaseEndTag = url.indexOf("?", databaseStartTag);
        if (databaseEndTag == -1) {
            databaseEndTag = url.length();
            databaseEndTag = url.indexOf(":", databaseStartTag);
            if (databaseEndTag == -1) {
                databaseEndTag = url.length();
            }
        }
        return new URLLocation(databaseStartTag + 1, databaseEndTag);
    }

    @Override
    public ConnectionInfo parse() {
        URLLocation location = fetchDatabaseHostsIndexRange();
        String host = url.substring(location.startIndex(), location.endIndex());
        return new ConnectionInfo(component, dbType, host, fetchDatabaseNameFromURL());
    }

}
