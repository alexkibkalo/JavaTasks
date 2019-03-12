package ee.task5;

public class ContextStrategy {
    private Strategy strategy;

    ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double price){
        return strategy.getPrice(price);
    }
}
