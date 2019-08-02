package HiveThirftClient;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
//import org.apache.hadoop.hive.service.HiveClient;
//hive1.2以下版本也许可以使用

public class HiveThirftClient {


    public static void main(String[] args) throws Exception{
        //创建socket连接
        final TSocket tSocket = new TSocket("192.168.0.2",10000);
        //创建一个协议
        final TProtocol tProtocol = new TBinaryProtocol(tSocket);
        //创建Hive client

        //final HiveClient client = new HiveClient(tProtocol);







        //打开socket
        tSocket.open();
        //执行HQL
        //client.exec

    }
}
