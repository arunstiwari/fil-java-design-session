package com.fil.patterns.pizza;

public class PizzaProcessor {
    public void preparePizza(String type){
        Pizza pizza = PizzaFactory.createPizza(type);
        pizza.prepare();
    }
}
