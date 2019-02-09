package oop.task5;

public class ImplementFindingMinNumber {
    public int getMinValue(int... list){
        int temp = list[0];
        for (int i : list) {
            if(i < temp){
                temp = i;
            }
        }
        return temp;
    }
}
