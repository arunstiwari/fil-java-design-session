package com.fil.patterns.pizza;

public class PizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza;
        switch (type){
            case "MARGARET":
                pizza =  new MargaretPizza();
            case "PEPPERONI":
                pizza = new PepperoniPizza();
            case "VEGGIE":
                pizza = new VeggiePizza();
            case "PINEAPPLE":
                pizza = new PineApplePizza();
            default:
                pizza = new MargaretPizza();
        }
        return pizza;
    }
}
