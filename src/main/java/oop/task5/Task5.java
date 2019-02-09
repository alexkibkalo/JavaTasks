package oop.task5;

public class Task5 {

    private static void showResult(FindingMinNumber fmnObject, int... list){
        System.out.println(fmnObject.operation(list));
    }

    //3.2
    public static void main(String[] args) {
        ImplementFindingMinNumber ifmnObject = new ImplementFindingMinNumber();
        showResult(ifmnObject::getMinValue, 7, 3, 10, 5);
    }

}
