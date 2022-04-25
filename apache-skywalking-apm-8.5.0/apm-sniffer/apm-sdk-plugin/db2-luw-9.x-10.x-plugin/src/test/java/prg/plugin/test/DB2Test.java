package prg.plugin.test;

import org.apache.skywalking.apm.plugin.jdbc.connectionurl.parser.DB2UrlParser;
import org.apache.skywalking.apm.plugin.jdbc.trace.ConnectionInfo;

public class DB2Test {
    public static void main(String[] args) {
        DB2UrlParser parser =new DB2UrlParser("jdbc:db2://197.3.133.116:60006/TESTDB:user=zhangsan;pwd=123");
        ConnectionInfo connectionInfo = parser.parse();
        System.out.println(connectionInfo.getDatabaseName());
        System.out.println(connectionInfo.getDatabasePeer());
    }
}
