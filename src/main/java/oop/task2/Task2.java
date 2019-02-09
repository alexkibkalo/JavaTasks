package oop.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    private static void solutionQuadraticEquation(){
        double a, b, c, D;

        System.out.println("Enter a:");
        a = scanner.nextDouble();
        System.out.println("Enter b:");
        b = scanner.nextDouble();
        System.out.println("Enter c:");
        c = scanner.nextDouble();

        D = Math.pow(b, 2) - 4 * a * c;
        if(D > 0){
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }else if(D == 0){
            double x1 = (-b) / (2 * a);
            System.out.println("x1 = " + x1);
        }else{
            System.out.println("D < 0, solution doesn't exist!");
        }
    }

    private static void sumOfInfiniteRow(){
        System.out.println("Enter eps:");
        double sum = 0, n = 1, count = 1, eps = scanner.nextDouble();

        while(n > eps){
            n = (1 / count);
            sum += n;
            count *= 2;
        }
        System.out.println(n + " < " + eps + "\nSum: " + sum);
    }

    private static void powersOfNum8(){
        final int num = 8;

        System.out.println("Enter number from 0 to 10:");
        int power = scanner.nextInt();

        // Arithmetic method
        if (power >= 0 && power <= 10) {
            for (int i = 0; i <= power; i++) {
                System.out.println(num + " ^ " + i + " = " + (int) Math.pow(num, i));
            }
        } else {
            System.err.println("Incorrect num!");
        }
        System.out.println();

        // Bit operations
        if (power >= 0 && power <= 10) {
            for (int i = 0; i <= power; i++) {
                System.out.printf("8 ^ %d = %d\n", i, 1 << (i * 3));
            }
        } else {
            System.err.println("Incorrect num!");
        }
    }

    private static void binaryNum(){
        System.out.println("Enter decimal num:");
        byte b = scanner.nextByte();
        boolean flag = false;
        for (int i = 7; i >= 0; i--) {
            byte res = (byte) (1 & (b >> i));
            if(res == 1){
                flag = true;
            }
            if(flag){
                System.out.print(res);
            }
        }
    }

    private static void inverseBinaryNum(){
        System.out.println("Enter decimal num:");
        byte b = scanner.nextByte();
        List<Byte> num = new ArrayList<>();
        for (int i = 7; i >= 0; i--) {
            num.add((byte) (1 & (b >> i)));
        }
        Collections.reverse(num);
        for (Byte i : num) {
            System.out.print(i);
        }
    }

    private static void greatestCommonDivisor(){
        int num1, num2;
        System.out.println("Enter num 1:");
        num1 = scanner.nextInt();
        System.out.println("Enter num 2:");
        num2 = scanner.nextInt();

        while(num1 != 0 && num2 != 0){
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        System.out.println("GCD: " + (num1 + num2));
    }

    private static void searchSimpleNum(int from, int to){
        for (int i = from; i < to; i++) {
            if(isSimple(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isSimple(int num){
        int s = (int) Math.sqrt(num);

        if (num < 2){
            return false;
        }

        for (int i = 2; i <= s; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }

    private static int fibonacciCycle(int n) {
        if (n <= 1) {
            return n;
        }

        int previous = 0, next = 1, sum;

        for (int i = 2; i <= n; i++) {
            sum = previous;
            previous = next;
            next = sum + previous;
        }

        return next;
    }

    private static int fibonacciRecursion(int index){
        if (index <= 1) {
            return index;
        }else {
            return fibonacciRecursion(index - 1) + fibonacciRecursion(index - 2);
        }
    }

    private static double getNextSolution(int x , int y, int z){
        final double numerator = 4;
        double denumerator = x * y * z;
        return numerator / denumerator;
    }

    private static double piRecursion(double eps, int x, int y, int z){
        double pi = 3;
        double solution = getNextSolution(x, y, z);

        if (solution < eps) {
            pi += solution;
        }else
            pi += solution - piRecursion(eps, z, z + 1, z + 2);
        return pi;
    }

    private static double piCycle(double eps){
        int x = 2;
        int y = 3;
        int z = 4;

        double pi = 3;
        int count = 0;

        double solution;

        do {
            solution = getNextSolution(x, y, z);
            if ((count % 2) == 0) {
                pi += solution;
            } else {
                pi -= solution;
            }
            x = z;
            y = z + 1;
            z = z + 2;
            count++;
        } while (solution > eps);

        return pi;
    }

    public static void main(String[] args) {
        System.out.println("3.1");
        solutionQuadraticEquation();
        System.out.println("\n3.2");
        sumOfInfiniteRow();
        System.out.println("\n3.3");
        powersOfNum8();
        System.out.println("\n3.4");
        binaryNum();
        System.out.println("\n3.5");
        inverseBinaryNum();
        System.out.println("\n3.6");
        greatestCommonDivisor();
        System.out.println("\n3.7");
        System.out.println("Enter num 'from':");
        int from = scanner.nextInt();
        System.out.println("Enter num 'to':");
        int to = scanner.nextInt();
        System.out.print("Result: ");
        searchSimpleNum(from, to);
        System.out.println("\n3.8");
        System.out.println("Enter num:");
        int index = scanner.nextInt();
        System.out.println("\n3.8.1");
        for (int i = 0; i <= index; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
        System.out.println("\n3.8.2");
        for (int i = 0; i <= index; i++) {
            System.out.print(fibonacciCycle(i) + " ");
        }
        System.out.println("\n3.9");
        System.out.println("Enter num:");
        double eps = scanner.nextDouble();
        System.out.println("\n3.9.1");
        System.out.println(piCycle(eps));
        System.out.println("\n3.9.2");
        System.out.println(piRecursion(eps, 2, 3 ,4));
    }
}
