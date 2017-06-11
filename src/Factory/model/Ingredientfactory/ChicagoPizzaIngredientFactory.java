package Factory.model.Ingredientfactory;

/**
 * Created by zhi.chen on 2017/6/10.
 */


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {




    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
//        Veggies veggies[] = {"Garlic", "Onion", "Mushroom", "RedPepper"};

        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clam createClam() {
        return null;
    }
}
