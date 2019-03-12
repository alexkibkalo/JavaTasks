package ee.task5.behaviours;

import ee.task5.Strategy;

public class FullPrice implements Strategy {
    @Override
    public double getPrice(double price) {
        return price;
    }
}
