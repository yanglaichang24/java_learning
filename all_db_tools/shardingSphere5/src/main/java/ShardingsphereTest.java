import org.apache.shardingsphere.driver.api.ShardingSphereDataSourceFactory;
import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
import org.apache.shardingsphere.infra.config.mode.ModeConfiguration;
import org.apache.shardingsphere.mode.repository.standalone.StandalonePersistRepositoryConfiguration;

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

        StandalonePersistRepositoryConfiguration standalonePersistRepositoryConfiguration
                = new StandalonePersistRepositoryConfiguration(null,null);

        ModeConfiguration modeConfiguration = new ModeConfiguration("Standalone",
                standalonePersistRepositoryConfiguration,false);

        DataSource dataSource = ShardingSphereDataSourceFactory.createDataSource(modeConfiguration);

    }

}
