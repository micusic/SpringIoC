package com.TW.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class PizzaRecipeService {
    @Autowired
    private PizzaRecipe pizzaRecipe;

    public void printPizzaRecipe(){
        System.out.println(pizzaRecipe.popRecipe());
    }
}
