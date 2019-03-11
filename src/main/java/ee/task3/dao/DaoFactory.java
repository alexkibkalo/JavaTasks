package ee.task3.dao;

import java.sql.SQLException;
import java.util.List;

public interface DaoFactory<Entity> {
    void addObjects(Entity entity) throws SQLException;
    List<Entity> getAllObjects() throws SQLException;
}
