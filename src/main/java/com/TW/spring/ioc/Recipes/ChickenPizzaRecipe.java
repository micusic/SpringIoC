package com.TW.spring.ioc.Recipes;

public class ChickenPizzaRecipe implements PizzaRecipe{
    @Override
    public String popRecipe(){
        return "Chicken, cheese, dough.";
    }
}
