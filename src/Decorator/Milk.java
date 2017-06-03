package Decorator;

/**
 * Created by Nitong on 2017/6/3.
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Decorator.Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
