import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;

import javax.sql.DataSource;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Mr.Yang
 * @desc ShardingsphereDemo
 * @date 2023/2/15 11:26
 */
public class ShardingsphereDemo {


    public static void main(String[] args) throws URISyntaxException, IOException, SQLException {
        URL resource = ShardingsphereDemo.class.getResource("shardingspheredemo.yaml");
        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(new File(resource.toURI()));
        Connection connection = dataSource.getConnection();
    }







}
