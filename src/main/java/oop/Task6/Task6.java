package oop.Task6;

import oop.Task6.task_6_1.MonthOfYear;
import oop.Task6.task_6_2.ImplementAutoCloseable;
import oop.Task6.task_6_3.UserArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    //3.3
    private static void test_6_1(){
        for (MonthOfYear monthOfYear : MonthOfYear.values()) {
            System.out.println(monthOfYear.toString());
        }
    }

    //3.5
    private static void test_6_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size: ");
        try(ImplementAutoCloseable object = new ImplementAutoCloseable(new int[scanner.nextInt()])) {
            int localNum;

            System.out.println("Enter values: ");
            do{
                localNum = scanner.nextInt();
                object.add(localNum);
            }while(localNum > 0);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException ex) {
            System.out.println(ex.getClass());
        }
    }

    //3.7
    private static void test_6_3() {
        UserArray<Integer> arrInteger = new UserArray<>(new Integer[]{1, 3, 6, 9, 7});
        UserArray<String> arrString = new UserArray<>(new String[]{"1", "4", "2", "6", "3", "9", "2"});

        System.out.println("View:");
        arrInteger.print();
        arrString.print();

        System.out.print("\nFrequency: Integer|String = ");
        System.out.print(UserArray.frequency(arrInteger, 6) + "|");
        System.out.println(UserArray.frequency(arrString, "2"));

        System.out.println("\nReverse:");
        UserArray.reverse(arrInteger);
        UserArray.reverse(arrString);
        arrInteger.print();
        arrString.print();

        System.out.println("\nSwapping:");
        UserArray.swapValues(arrInteger, 1, 3);
        UserArray.swapValues(arrString, 1, 3);
        arrInteger.print();
        arrString.print();
    }

    public static void main(String[] args) {
        System.out.println("6.1");
        test_6_1();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n6.2");
        test_6_2();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n6.3");
        test_6_3();
    }
}
