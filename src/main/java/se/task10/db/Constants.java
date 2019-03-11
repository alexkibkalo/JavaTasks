package se.task10.db;

public class Constants {
    //Constants for connection
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/task10";
    public static final String DRIVER = "com.mysql.jdbc.Driver";

    //Constants for SQL (Lesson)
    public final static String SQL_ALTER_TABLE = "ALTER TABLE lessons ADD id_teacher INT NOT NULL";

    //Constants for SQL (Studying)
    public final static String SQL_UPDATE_MID_VALUE = "UPDATE studying SET mid_value = ? WHERE id_student = ?";
    public final static String SQL_SELECT_INFO_QUERY1 = "SELECT students.name, students.fathername, students.surname, " +
            "studying.group, lessons.name, lessons.time, teachers.name, teachers.fathername, teachers.surname, teachers.position" +
            " FROM students INNER JOIN studying ON students.id = studying.id_student" +
            " INNER JOIN lessons INNER JOIN teachers ON lessons.id_teacher = teachers.id";

    public final static String SQL_SELECT_INFO_QUERY2 = "SELECT students.name, students.fathername, students.surname, " +
            "studying.group, studying.mid_value FROM students INNER JOIN studying ON students.id = studying.id_student " +
            "WHERE studying.mid_value > 4.5 ORDER BY mid_value asc";
}
