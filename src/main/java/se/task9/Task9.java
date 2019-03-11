package se.task9;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task9 {
    private static int result = 0;

    private static void add(int number){
        result += number;
    }

    private static void getSumDigitsByValue(Integer value) {
        Stream<String> digits = Arrays.stream(value.toString().split(""));
        digits.forEach(i -> add(Integer.parseInt(i)));
        System.out.println(result);
    }

    private static void getPositiveNumbers(int from, int to) {
        IntStream list = IntStream.range(from, to + 1).filter(j -> j > 0);
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    //3.2
    private static void execute() {
        getPositiveNumbers(-7, 11);
        getSumDigitsByValue(1735);
    }

    public static void main(String[] args) {
        execute();
    }
}
