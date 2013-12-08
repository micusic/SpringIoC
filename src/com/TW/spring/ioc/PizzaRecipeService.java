package com.TW.spring.ioc;

public class PizzaRecipeService {
    private PizzaRecipe pizzaRecipe = new BaconPizzaRecipe();

    public void printPizzaRecipe(){
        System.out.println(pizzaRecipe.popRecipe());
    }
}
