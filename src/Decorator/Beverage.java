package Decorator;

/**
 * Created by Nitong on 2017/6/3.
 */
public abstract class Beverage {
    String description = "Unknown Decorator.Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
