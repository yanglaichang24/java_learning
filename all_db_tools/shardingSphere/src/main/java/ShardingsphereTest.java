import org.apache.shardingsphere.driver.api.ShardingSphereDataSourceFactory;
import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Mr.Yang
 * @desc ShardingsphereTest
 * @date 2023/3/3 11:45
 */
public class ShardingsphereTest {


    public static void main(String[] args) throws URISyntaxException, IOException, SQLException {
        URL resource = ShardingsphereDemo.class.getResource("shardingsphere-demo.yaml");
        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(new File(resource.toURI()));
        Connection connection = dataSource.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("select * from t_order where account_id = 10 and order_id = 21");
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("===================" + resultSet);
    }

    public Connection getConnection() throws SQLException, URISyntaxException, IOException {
        URL resource = ShardingsphereDemo.class.getResource("shardingsphere-demo.yaml");
        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(new File(resource.toURI()));
        return dataSource.getConnection();
    }

    @Test
    public void insert() throws SQLException, IOException, URISyntaxException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into t_order(account_id,order_id) value(24,20)");
        int i = preparedStatement.executeUpdate();
        System.out.println("----------"+i);
    }

}
