package se.task5.entities;

import java.io.Serializable;

public class Lesson implements Serializable {
    private String name;

    public Lesson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                '}';
    }
}
