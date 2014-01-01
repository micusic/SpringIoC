package com.TW.spring.ioc.Recipes;

public class BaconPizzaRecipe implements PizzaRecipe{
    @Override
    public String popRecipe(){
        return "Bacon, cheese, dough.";
    }
}
