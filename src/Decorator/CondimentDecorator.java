package Decorator;

/**
 * Created by Nitong on 2017/6/3.
 */


public abstract class CondimentDecorator extends Beverage {
    //所有继承类都必须实现getDescription()方法
    public abstract String getDescription();
}
