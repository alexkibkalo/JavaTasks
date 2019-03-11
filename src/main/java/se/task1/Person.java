package se.task1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String name;
    private Calendar data_of_birth;

    Person(String name, GregorianCalendar data_of_birth) {
        this.name = name;
        this.data_of_birth = data_of_birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDataOfBirth() {
        return data_of_birth;
    }
}
