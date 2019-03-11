package se.task10;

import se.task10.implementation.ImplementLessonModel;
import se.task10.implementation.ImplementsStudentModel;

import java.sql.SQLException;

public class Task10 {

    //3.4
    private static void execute() throws SQLException {
        ImplementsStudentModel studentModel = new ImplementsStudentModel();
        ImplementLessonModel lessonModel = new ImplementLessonModel();

        //1
        lessonModel.alter();
        //2
        studentModel.update(2.5);
        //3
        studentModel.printObjects(1);
        //4
        studentModel.printObjects(2);

        System.out.println("Success!");
    }

    public static void main(String[] args) throws SQLException {
        execute();
    }
}
