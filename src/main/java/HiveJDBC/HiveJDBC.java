package HiveJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Hive必须以service模式运行:
 *
 hive --service hiveserver2
 hiveserver2 --hiveconf hive.server2.thrift.port=20001
 * */


public class HiveJDBC {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement =null;
        ResultSet resultSet = null;
        String sql = "select * from stupart";



        try {
            //获取连接
            connection =JDBCUtils.getConnection();
            //创建运行环境
            statement = connection.createStatement();
            //运行sql
            resultSet = statement.executeQuery(sql);

            //处理数据
            while (resultSet.next()){
                String id =resultSet.getString("id");
                String name =resultSet.getString(2);
                System.out.println(id+"\t"+name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
