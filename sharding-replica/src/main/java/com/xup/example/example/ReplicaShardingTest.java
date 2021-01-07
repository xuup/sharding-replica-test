//package com.abchina.example.example;
//
//import ReplicaExampleMain;
//import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
//import org.junit.Test;
//
//import javax.sql.DataSource;
//import java.io.File;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class ReplicaShardingTest {
//
//    @Test
//    public void test() throws IOException, SQLException {
//        String sql = "select * from t_order where user_id = 3 and order_id = 12";
//        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(getFile("/application-replica.yaml"));
//        Connection connection = dataSource.getConnection();
//        PreparedStatement statement = connection.prepareStatement(sql);
//        ResultSet rs = statement.executeQuery();
//        while (rs.next()){
//            System.out.printf(rs.getString(1) + " ");
//            System.out.printf(rs.getString(2)+" ");
//            System.out.printf(rs.getString(3)+" ");
//            System.out.printf(rs.getString(4)+" ");
//        }
//        rs.close();
//        statement.close();
//        connection.close();
//    }
//
//
//    @Test
//    public void testInsert() throws IOException, SQLException {
//        String sql = "insert into t_order values (133,2,2,'insert test')";
//        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(getFile("/application-replica.yaml"));
//        Connection connection = dataSource.getConnection();
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.executeUpdate();
//
//        statement.close();
//        connection.close();
//    }
//
//
//    private  File getFile(final String fileName) {
//       return new File(this.getClass().getResource(fileName).getFile());
//        //return new File("C:\\devData\\IdeaProjects\\shardingsphere-test\\sharding-replica\\src\\main\\resources\\application-replica.yaml");
//    }
//}
