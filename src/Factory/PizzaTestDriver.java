package Factory;

import Factory.model.ChicagoPizzaStore;
import Factory.model.NYPizzaStore;
import Factory.model.Pizza;
import Factory.model.PizzaStore;

/**
 * Created by zhi.chen on 2017/6/10.
 */

public class PizzaTestDriver {

    public static void main(String[] args){
        //new 2个不同的店
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A ordered a "+pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("B ordered a "+pizza.getName());

    }
}
