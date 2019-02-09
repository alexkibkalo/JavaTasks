package oop.task3;

public class Task3 {

    //3.1.1 Arrays
    private static void sumOfPositiveElementsCycle(double[] numbers){
        double sum = 0;
        for (double number : numbers) {
            if(number > 0){
                sum += number;
            }
        }
        System.out.println(sum);
    }

    //3.1.2 Arrays
    private static double getElementSum(double[] numbers, int d){
        if(d <= 0){
            return 0;
        }else
           d--;

        if(numbers[d] > 0){
            return numbers[d] + getElementSum(numbers, d);
        }else
            return 0 + getElementSum(numbers, d);
    }

    private static void sumOfPositiveElementsRecursion(double[] numbers) {
        double sum = getElementSum(numbers, numbers.length);
        System.out.println(sum);
    }

    //3.19 Strings
    private static void showAbbreviation(String expression) {
        StringBuilder abbreviation = new StringBuilder();
        String[] expressionArr = expression.split(" ");
        for (String word : expressionArr) {
            abbreviation.append(word.substring(0, 1).toUpperCase());
        }
        System.out.println(abbreviation.toString());
    }

    public static void main(String[] args) {
        double[] numbers = {2.9, 1.4, -5.4, 3.1, -2.0, -1.5, -7.3, 6.7};
        System.out.println("3.1.1");
        sumOfPositiveElementsCycle(numbers);
        System.out.println("\n3.1.2");
        sumOfPositiveElementsRecursion(numbers);
        System.out.println("\n3.19");
        showAbbreviation("Java Development Kit");
    }
}
