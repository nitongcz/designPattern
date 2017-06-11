package Factory.model;

import Factory.model.Ingredientfactory.ChicagoPizzaIngredientFactory;
import Factory.model.Ingredientfactory.PizzaIngredientFactory;

/**
 * Created by zhi.chen on 2017/6/10.
 */


public class ChicagoPizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String type) {

//        if (type.equals("cheese")){
//            return new ChicagoStyleCheesePizza();
//        }
////        else if (item.equals("veggie")){
////            return NYStyleVeggiePizza();
////        }else if (item.equals("clam")){
////            return NYStyleClamPizza();
////        }
//        else return null;

        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")){
            pizza=new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza.....");
        }

        return pizza;
    }
}
