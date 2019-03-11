package se.task4;

import se.task4.entities.Group;
import se.task4.entities.Student;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Task4 {

    //3.6
    private static void executeWriting() {
        Student student1 = new Student("Alex", 20);
        Student student2 = new Student("Vlad", 22);
        Student student3 = new Student("Oleg", 22);
        Student student4 = new Student("Vadim", 34);
        Student student5 = new Student("Artem", 20);
        Student student6 = new Student("Ruslan", 21);

        Group group = new Group("KIUKI-16-3", student1, student2, student3, student4, student5, student6);

        try (ZipOutputStream stream = new ZipOutputStream(new FileOutputStream("group.zip"));
            DataOutputStream out = new DataOutputStream(stream)) {

            for (Student student : group.getStudents()) {
                ZipEntry zip = new ZipEntry(student.getName());
                stream.putNextEntry(zip);

                out.writeChars(student.getName());
                out.writeInt(student.getAge());

                stream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeReading() {
        try (ZipInputStream stream = new ZipInputStream(new FileInputStream("group.zip"));
             DataInputStream in = new DataInputStream(stream)) {
            ZipEntry zip;

            while ((zip = stream.getNextEntry()) != null) {
                System.out.println("Name: " + zip.getName());
                System.out.println("Age: " + in.readInt());
                System.out.println();

                stream.closeEntry();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        executeWriting();
        executeReading();
    }
}
