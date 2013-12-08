package com.TW.spring.ioc;

public class BaconPizzaRecipe implements PizzaRecipe{
    @Override
    public String popRecipe(){
        return "Bacon, cheese, dough.";
    }
}
