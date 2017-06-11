package Factory.model;

import Factory.model.Ingredientfactory.PizzaIngredientFactory;

/**
 * Created by zhi.chen on 2017/6/10.
 */


public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory=ingredientFactory;
    }

    void prepare(){
        System.out.println("Preparing..."+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
    }
}
