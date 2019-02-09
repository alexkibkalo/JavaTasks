package oop.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    //2.1
    private static double getValue(int value1, int value2) {
        int result = value1 * value2;
        if(result > 0){
            return Math.sqrt(result);
        }else{
            System.out.println("Incorrect number!");
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 number:");
        int value1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter 2 number:");
        int value2 = Integer.parseInt(reader.readLine());
        System.out.println("Result: " + getValue(value1, value2));
    }
}
