package oop.Task6.task_6_2;

import java.util.Arrays;
import java.util.InputMismatchException;

public class ImplementAutoCloseable implements AutoCloseable {

    private static int index = 0;
    private int[] numbers;

    public ImplementAutoCloseable(int[] numbers) {
        this.numbers = numbers;
    }

    public void add(int x) {
        numbers[index] = x;
        index++;
    }

    @Override
    public void close() throws InputMismatchException, ArrayIndexOutOfBoundsException {
        String string = Arrays.toString(numbers);
        System.out.println(string);
    }
}
