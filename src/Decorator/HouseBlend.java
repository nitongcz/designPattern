package Decorator;

/**
 * Created by Nitong on 2017/6/3.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "Decorator.HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
