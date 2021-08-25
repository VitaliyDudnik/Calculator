package org.example.console;


import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {

    public void CalculatorStartMessage() {
        System.out.println("Hello! This is a console calculator. Please follow of the calculator recommendations. If you want to quit, enter 'exit' ");
    }
    public void enterMessage(String message) {
        System.out.println(message);
    }
    public void calculatorEndMessage(){
        System.out.println("thank you for using calculator."+"\n"+"See you later!");
    }
}
