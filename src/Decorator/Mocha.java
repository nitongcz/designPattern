package Decorator;

/**
 * Created by Nitong on 2017/6/3.
 */


public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Decorator.Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
