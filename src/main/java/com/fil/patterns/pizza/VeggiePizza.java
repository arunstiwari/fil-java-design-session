package com.fil.patterns.pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Veggie Pizza");
    }
}
