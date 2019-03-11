package se.task5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import se.task5.entities.Group;
import se.task5.entities.Lesson;
import se.task5.entities.Student;
import se.task5.entities.Teacher;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParser {

    private List<Student> getStudents(Element element){
        List<Student> students = new ArrayList<>();
        NodeList list = element.getElementsByTagName("Student");

        for (int i = 0; i < list.getLength(); i++) {
            String[] res = list.item(i).getTextContent().split("\n");
            Student student = new Student(res[1].trim(), Integer.parseInt(res[2].trim()));
            students.add(student);
        }
        return students;
    }


    private List<Teacher> getTeachers(Element element){
        List<Teacher> teachers = new ArrayList<>();
        NodeList list = element.getElementsByTagName("Teacher");

        for (int i = 0; i < list.getLength(); i++) {
            String[] res = list.item(i).getTextContent().split("\n");
            Teacher teacher = new Teacher(res[1].trim(), Integer.parseInt(res[2].trim()));
            teachers.add(teacher);
        }
        return teachers;
    }

    private List<Lesson> getLessons(Element element){
        List<Lesson> lessons = new ArrayList<>();
        NodeList list = element.getElementsByTagName("Lesson");

        for (int i = 0; i < list.getLength(); i++) {
            String[] res = list.item(i).getTextContent().split("\n");
            Lesson lesson = new Lesson(res[1].trim());
            lessons.add(lesson);
        }
        return lessons;
    }

    public void execute() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File("group.xml"));
            document.getDocumentElement().normalize();

            Element element = document.getDocumentElement();
            NodeList nodeList = document.getElementsByTagName("Group");

            for (int temp = 0; temp < nodeList.getLength(); temp++) {
                Node node = nodeList.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    List<Student> students = getStudents(element);
                    List<Teacher> teachers = getTeachers(element);
                    List<Lesson> lessons = getLessons(element);

                    Group group = new Group(name, students, teachers, lessons);

                    System.out.println("~~~~~~~~~ Teachers:");
                    for (Teacher teacher : group.getTeachers()) {
                        System.out.println(teacher.getName() + " " + teacher.getAge());
                    }

                    System.out.println("~~~~~~~~~ Lessons:");
                    for (Lesson lesson : lessons) {
                        System.out.println(lesson.getName());
                    }

                    System.out.println("~~~~~~~~~ Students:");
                    for (Student student : group.getStudents()) {
                        System.out.println(student.getName() + " " + student.getCourse());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
