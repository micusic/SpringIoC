package com.TW.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PizzaRecipeMachine {
    public static void main(String[] args){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
        PizzaRecipeService pizzaRecipeService = (PizzaRecipeService)applicationContext.getBean("pizzaRecipeService");
        pizzaRecipeService.printPizzaRecipe();
    }
}
