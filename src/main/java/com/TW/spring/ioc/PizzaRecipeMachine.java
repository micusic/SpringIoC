package com.TW.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PizzaRecipeMachine extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
        PizzaRecipeService pizzaRecipeService = (PizzaRecipeService)applicationContext.getBean("pizzaRecipeService");
        pizzaRecipeService.printPizzaRecipe(resp.getWriter());
    }
}
