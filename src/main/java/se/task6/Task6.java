package se.task6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Scanner;

public abstract class Task6 implements Annotation {

    //3.1
    private static void test(String className) {
        try {
            Class<?> cls = Class.forName(className);

            System.out.println("~~~~~~~~~~ Methods: ");
            for (Method m : cls.getMethods()) {
                System.out.println(m.getName());
            }

        } catch (ClassNotFoundException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private static void execute(){
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        System.out.println("Class name: " + className);
        test(className);
    }

    public static void main(String[] args) {
        execute();
    }
}
