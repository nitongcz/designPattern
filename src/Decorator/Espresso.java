package Decorator;

/**
 * Created by Nitong on 2017/6/3.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Decorator.Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
