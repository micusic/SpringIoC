package com.TW.spring.ioc;

import com.TW.spring.ioc.Recipes.PizzaRecipe;

import javax.annotation.Resource;
import java.io.PrintWriter;

public class PizzaRecipeService {
    @Resource
    private PizzaRecipe pizzaRecipe;

    public void printPizzaRecipe(PrintWriter writer){
        writer.println(pizzaRecipe.popRecipe());
    }
}
