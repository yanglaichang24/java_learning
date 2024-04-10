import org.apache.shardingsphere.driver.api.ShardingSphereDataSourceFactory;
import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Mr.Yang
 * @desc ShardingsphereTest
 * @date 2023/3/3 11:45
 */
public class ShardingsphereTest {


    public static void main(String[] args) throws URISyntaxException, IOException, SQLException {
        //URL resource = ShardingsphereDemo.class.getResource("shardingspheredemo.yaml");

        //ShardingSphereDataSourceFactory.createDataSource()

       // DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(new File(resource.toURI()));
        //Connection connection = dataSource.getConnection();
    }

}
