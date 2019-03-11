package se.task8;

public class Task8 {

    private static int mul = 1;
    private static int sum = 0;

    private static void mul(int[] arr) {
        for (int i : arr) {
            mul *= i;
        }
        System.out.println("Mul: " + mul);
    }

    private static void sum(int[] arr) {
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    private static int getMidValue(){
        return (sum + mul) / 2;
    }

    private static synchronized void execute() {
        System.out.println("-> " + Thread.currentThread().getName());

        int[] array = {1, 5, 7, 3, 7};

        mul(array);
        sum(array);

        if(Thread.currentThread().getName().equals("Sum")){
            System.out.println(getMidValue());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(Task8::execute, "Mul");
        Thread thread2 = new Thread(Task8::execute, "Sum");

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
