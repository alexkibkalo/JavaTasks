package oop.Task6.task_6_3;

public class UserArray<T> {

    private T[] array;

    public UserArray(T[] t) {
        array = t;
    }

    public void print(){
        System.out.print("[ ");
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println("]");
    }

    public static <T> T[] swapValues(UserArray<T> list, int x, int y){
        if(x > 0 && x < list.array.length && y > 0 && y < list.array.length){
            T temp = list.array[x];
            list.array[x] = list.array[y];
            list.array[y] = temp;
        }
        return list.array;
    }

    public static <T> T[] reverse(UserArray<T> list){
        for (int left = 0, right = list.array.length - 1; left < right; left++, right--) {
            T temp = list.array[left];
            list.array[left]  = list.array[right];
            list.array[right] = temp;
        }
        return list.array;
    }

    public static <T> Integer frequency(UserArray<T> list, Object value){
        Integer localCounter = 0;
        for (Object object : list.array) {
            if(value.equals(object)){
                localCounter++;
            }
        }
        return localCounter;
    }
}
