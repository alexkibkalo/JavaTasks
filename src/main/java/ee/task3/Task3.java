package ee.task3;

import ee.task3.dao.implementation.ImplementGroupModel;
import ee.task3.dao.implementation.ImplementStudentModel;
import ee.task3.entities.Group;
import ee.task3.entities.Student;
import ee.task3.factory.HibernateSessionFactory;
import org.hibernate.SessionFactory;

import java.util.List;

public class Task3 {

    private static void test() {
        Student student = new Student();
        student.setAge(20);
        student.setName("Alexandr2");
        student.setAddress("Kharkiv1");
        student.setSurname("Kibkalo1");
        student.setGroup("KIUKI-16-34");

        ImplementStudentModel studentModel = new ImplementStudentModel();

        studentModel.addObjects(student);
        List<Student> studs = studentModel.getAllObjects();

        System.out.println("All students:");
        for (Student stud : studs) {
            System.out.println(stud.toString());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Group group1 = new Group();
        group1.setName("KIUKI-16-3");
        Group group2 = new Group();
        group2.setName("KIUKI-16-5");

        ImplementGroupModel groupModel = new ImplementGroupModel();
        groupModel.addObjects(group1);
        groupModel.addObjects(group2);

        List<Group> groups = groupModel.getAllObjects();

        System.out.println("All groups:");
        for (Group group : groups) {
            System.out.println(group.toString());
        }
    }

    private static void execute() {
        SessionFactory factory = HibernateSessionFactory.getSessionFactory();
        test();
        factory.close();
    }

    public static void main(String[] args) {
        execute();
    }
}
