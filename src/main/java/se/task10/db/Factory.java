package se.task10.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

public interface Factory<Entity extends Serializable>{

    Connection connection = ConnectionDB.getConnection();

    void printObjects(int numQuery) throws SQLException;

    void update(Object o) throws SQLException;

    void alter() throws SQLException;
}
