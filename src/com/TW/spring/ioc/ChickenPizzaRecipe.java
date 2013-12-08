package com.TW.spring.ioc;

public class ChickenPizzaRecipe implements PizzaRecipe{
    @Override
    public String popRecipe(){
        return "Chicken, cheese, dough.";
    }
}
