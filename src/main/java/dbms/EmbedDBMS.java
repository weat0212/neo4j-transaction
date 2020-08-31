package dbms;

import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;

import java.io.File;

/**
 * @author weat0212@gmail.com
 * @project Thesis
 * @package dbms
 * @date 2020/8/31 下午 08:15
 */
public class EmbedDBMS {
    public EmbedDBMS() {
        DatabaseManagementService managementService = new DatabaseManagementServiceBuilder(
                new File("C:\\Program Files\\neo4j-community-4.0.2-windows\\neo4j-community-4.0.2")).build();
        graphDb = managementService.database("neo4j");
        registerShutdownHook(managementService);
    }
}
