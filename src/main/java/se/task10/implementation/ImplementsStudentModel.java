package se.task10.implementation;

import se.task10.db.Factory;
import se.task4.entities.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static se.task10.db.Constants.*;

public class ImplementsStudentModel implements Factory<Student> {
    @Override
    public void printObjects(int numQuery) throws SQLException {

        PreparedStatement preparedStatement;

        if (numQuery == 1) {
            preparedStatement = connection.prepareStatement(SQL_SELECT_INFO_QUERY1);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("students.name") + " | " +
                                resultSet.getString("students.fathername") + " | " +
                                resultSet.getString("students.surname") + " | " +
                                resultSet.getString("studying.group") + " | " +
                                resultSet.getString("lessons.name") + " | " +
                                resultSet.getString("lessons.time") + " | " +
                                resultSet.getString("teachers.name") + " | " +
                                resultSet.getString("teachers.fathername") + " | " +
                                resultSet.getString("teachers.surname") + " | " +
                                resultSet.getString("teachers.position")
                );
            }

            resultSet.close();
            preparedStatement.close();

        } else if (numQuery == 2) {
            preparedStatement = connection.prepareStatement(SQL_SELECT_INFO_QUERY2);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("students.name") + " | " +
                                resultSet.getString("students.fathername") + " | " +
                                resultSet.getString("students.surname") + " | " +
                                resultSet.getString("studying.group") + " | " +
                                resultSet.getString("studying.mid_value")
                );
            }

            resultSet.close();
            preparedStatement.close();

        }
    }

    @Override
    public void update(Object o) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_MID_VALUE);
        preparedStatement.setDouble(1, Double.parseDouble(o.toString()));
        preparedStatement.setInt(2, 1);
        preparedStatement.executeUpdate();

        preparedStatement.close();
    }

    @Override
    public void alter() throws SQLException {

    }
}
