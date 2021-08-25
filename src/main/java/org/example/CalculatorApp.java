package org.example;

import org.example.calculatorRun.CalculatorRun;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        CalculatorRun calculator = (CalculatorRun) applicationContext.getBean("calculatorRun");
        calculator.run();
    }
}



