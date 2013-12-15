package com.TW.spring.ioc;

import javax.annotation.Resource;

public class PizzaRecipeService {
    @Resource
    private PizzaRecipe pizzaRecipe;

    public void printPizzaRecipe(){
        System.out.println(pizzaRecipe.popRecipe());
    }
}
