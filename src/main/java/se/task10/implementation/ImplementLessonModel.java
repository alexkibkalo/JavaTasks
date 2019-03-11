package se.task10.implementation;

import se.task10.db.Factory;
import se.task5.entities.Lesson;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static se.task10.db.Constants.SQL_ALTER_TABLE;

public class ImplementLessonModel implements Factory<Lesson> {

    @Override
    public void printObjects(int numQuery) throws SQLException {

    }

    @Override
    public void update(Object o) throws SQLException {

    }

    @Override
    public void alter() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_ALTER_TABLE);
        preparedStatement.executeUpdate();

        preparedStatement.close();
    }
}
