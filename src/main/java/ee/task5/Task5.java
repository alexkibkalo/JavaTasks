package ee.task5;

import ee.task5.behaviours.FullPrice;
import ee.task5.behaviours.HalfPrice;

public class Task5 {
    public static void main(String[] args) {
        ContextStrategy strategy = new ContextStrategy(new FullPrice());
        double finishPrice1 = strategy.getPrice(100);
        System.out.println("Price 1:  " + finishPrice1);

        strategy = new ContextStrategy(new HalfPrice());
        double finishPrice2 = strategy.getPrice(48);
        System.out.println("Price 2:  " + finishPrice2);
    }
}
