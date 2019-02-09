package oop.task4.task_4_2;

import java.util.Arrays;

public class Matrix {
    private String name;
    private int size;
    private int[][] matrix;

    public Matrix(String name, int size, int[][] matrix) {
        this.name = name;
        this.size = size;
        this.matrix = matrix;
    }

    @Override
    protected Matrix clone() throws CloneNotSupportedException {
        Matrix localeObject = (Matrix) super.clone();
        localeObject.matrix.clone();
        return localeObject;
    }

    @Override
    public boolean equals(Object o) {
        Matrix localeMatrix = (Matrix) o;
        return Arrays.deepEquals(localeMatrix.matrix, matrix);
    }

    @Override
    public String toString() {
        return "Matrix { " + name +
                ", size: " + (matrix[0].length + matrix[1].length) +
                ", data: " + Arrays.toString(matrix[0]) +
                " " + Arrays.toString(matrix[1]) +
                " }";
    }
}
