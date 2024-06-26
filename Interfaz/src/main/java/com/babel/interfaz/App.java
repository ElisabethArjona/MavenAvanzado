package com.babel.interfaz;

import com.babel.interfaz.applications.CalculadoraApp;
import com.babel.interfaz.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CalculadoraApp calculadoraApp = context.getBean(CalculadoraApp.class);

        calculadoraApp.run();
    }
}
