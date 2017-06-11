package Factory.model;

import Factory.model.Ingredientfactory.NYPizzaIngredientFactory;
import Factory.model.Ingredientfactory.PizzaIngredientFactory;

/**
 * Created by zhi.chen on 2017/6/10.
 */


public class NYPizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String type) {

//        if (type.equals("cheese")){
//            return new NYStyleCheesePizza();
//        }
////        else if (item.equals("veggie")){
////            return NYStyleVeggiePizza();
////        }else if (item.equals("clam")){
////            return NYStyleClamPizza();
////        }
//        else return null;

        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")){
            pizza=new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza.....");
        }

        return pizza;
    }
}
