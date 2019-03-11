package se.task5.entities;

import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Lesson> lessons;

    public Group(String name, List<Student> students, List<Teacher> teachers, List<Lesson> lessons) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group : " + name + '\n' +
                "Students : " + students + '\n' +
                "Teachers : " + teachers + '\n' +
                "Lessons : " + lessons;
    }
}
