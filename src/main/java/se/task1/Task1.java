package se.task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

//3.2
public class Task1 {

    private static int getAge(Person person){
        DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Calendar data = Calendar.getInstance();
        Calendar data1 = person.getDataOfBirth();
        int age = 0;

        int cy = data.get(Calendar.YEAR);
        int cm = Calendar.MONTH;
        int cd = Integer.parseInt(formatter.format(Calendar.getInstance().getTime()).split("/")[2]);

        int y = data1.get(Calendar.YEAR);
        int m = Integer.parseInt(formatter.format(person.getDataOfBirth().getTime()).split("/")[1]) - 1;
        int d = Integer.parseInt(formatter.format(person.getDataOfBirth().getTime()).split("/")[2]);

        if(cy > y){
            if(cm < m){
                age = cy - y - 1;
            }else if(cm == m){
                if(cd < d){
                    age = cy - y - 1;
                }else
                    age = cy - y;
            }else
                age = cy - y;
        }

        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alex", new GregorianCalendar(1999, 2, 10));
        Person person2 = new Person("Artem", new GregorianCalendar(2000, 9, 10));
        System.out.println(person1.getName() + " has " + getAge(person1) + " years old!");
        System.out.println(person2.getName() + " has " + getAge(person2) + " years old!");
    }
}
