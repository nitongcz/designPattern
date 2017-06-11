package Factory.model.Ingredientfactory;

/**
 * Created by zhi.chen on 2017/6/10.
 */


public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
