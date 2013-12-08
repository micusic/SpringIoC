package com.TW.spring.ioc;

public class PizzaRecipeMachine {
    public static void main(String[] args){
        PizzaRecipeService pizzaRecipeService = new PizzaRecipeService();
        pizzaRecipeService.printPizzaRecipe();
    }
}
