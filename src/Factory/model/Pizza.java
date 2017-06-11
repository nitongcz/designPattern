package Factory.model;

import Factory.model.Ingredientfactory.*;

import java.util.ArrayList;

/**
 * Created by zhi.chen on 2017/6/10.
 */
public abstract class Pizza {
    //定义Pizza的属性
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
//    ArrayList toppings = new ArrayList();  //一套佐料
/*
    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough..."+dough);
        System.out.println("Adding sauce..."+sauce);
        System.out.println("Adding toppings: "+toppings);

        for (int i=0;i<toppings.size();i++){
            System.out.println("   "+toppings.get(i));
        }
    }*/

    abstract void prepare();

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clam getClam() {
        return clam;
    }

    public void setClam(Clam clam) {
        this.clam = clam;
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting ...");
    }

    void box(){
        System.out.println("Place pizza in box...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getDough() {
//        return dough;
//    }
//
//    public void setDough(String dough) {
//        this.dough = dough;
//    }
//
//    public String getSauce() {
//        return sauce;
//    }
//
//    public void setSauce(String sauce) {
//        this.sauce = sauce;
//    }

//    public ArrayList getToppings() {
//        return toppings;
////    }
//
//    public void setToppings(ArrayList toppings) {
//        this.toppings = toppings;
//    }
}
