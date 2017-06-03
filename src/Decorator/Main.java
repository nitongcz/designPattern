package Decorator;

public class Main {

    public static void main(String[] args) {
        //多态
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
        //多态
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());


    }
}
