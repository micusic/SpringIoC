package com.TW.spring.ioc;

public class PizzaRecipeService {
    private PizzaRecipe pizzaRecipe;

    public void setPizzaRecipe(PizzaRecipe pizzaRecipe) {
        this.pizzaRecipe = pizzaRecipe;
    }

    public void printPizzaRecipe(){
        System.out.println(pizzaRecipe.popRecipe());
    }
}
