package oop.task4;

import oop.task4.task_4_1.Citizen;
import oop.task4.task_4_1.Human;
import oop.task4.task_4_1.Employee;
import oop.task4.task_4_1.EmployeeWithASalary;
import oop.task4.task_4_1.EmployeeWithSalaryAtTheHour;
import oop.task4.task_4_2.Matrix;

import java.util.Arrays;
import java.util.List;

public class Task4 {

    //3.7 Hierarchy
    private static void runHierarchy(){
        Employee employee1 = new EmployeeWithASalary("Alex", "MT375377", "Company 337", 300.0, 5.7);
        Employee employee2 = new EmployeeWithSalaryAtTheHour("Vlad", "MT854754", "Company 335", 13.0, 40);
        Human human = new Citizen("Kostya", "MZ235332");
        List<Human> list = Arrays.asList(employee1, employee2, human);
        for (Human object : list) {
            if(object instanceof Employee){
                ((Employee) object).toPaySalary();
            }else
                System.out.println(object.toString());
        }
    }

    //3.11 Matrix
    private static void runMatrix(){
        int[][] matrix1 = {{1, 5, 7}, {2, 8}};
        int[][] matrix2 = {{3, 2, 1}, {3, 4, 1}};
        int[][] matrix3 = {{3, 2, 1}, {3, 4, 1}};

        Matrix object1 = new Matrix("matrix1", matrix1.length, matrix1);
        Matrix object2 = new Matrix("matrix2", matrix2.length, matrix2);
        Matrix object3 = new Matrix("matrix3", matrix3.length, matrix3);

        System.out.println(object1.toString());
        System.out.println(object2.toString());
        System.out.println(object3.toString());

        System.out.println("Comparing...");
        System.out.println("(matrix1 == matrix2) --> " + object1.equals(object2));
        System.out.println("(matrix2 == matrix3) --> " + object2.equals(object3));
    }

    public static void main(String[] args) {
        runHierarchy();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        runMatrix();
    }
}
