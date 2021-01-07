package com.xup.example.raw;

import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReplicaTest {

    @Test
    public void test() throws IOException, SQLException {
        String sql = "select * from t_order";
        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(getFile("application-replica.yaml"));
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            System.out.printf(rs.getString(1) + " ");
            System.out.printf(rs.getString(2)+" ");
            System.out.printf(rs.getString(3)+" ");
            System.out.printf(rs.getString(4)+" ");
        }
        rs.close();
        statement.close();
        connection.close();
    }


    @Test
    public void testInsert() throws IOException, SQLException {
        String sql = "insert into t_order values (133,2,2,'insert test')";
        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(getFile("/application-replica.yaml"));
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();

        statement.close();
        connection.close();
    }


    private static File getFile(final String fileName) {
        return new File(ReplicaTest.class.getResource("/"+fileName).getFile());
    }
}
