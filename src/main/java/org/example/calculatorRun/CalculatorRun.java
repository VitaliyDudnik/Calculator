package org.example.calculatorRun;

import org.example.exception.WrongEnterException;
import org.springframework.stereotype.Component;

@Component
public class CalculatorRun {
    private final CalculatorAction action = new CalculatorAction();

    public void run() {
        action.getConsoleWriter().CalculatorStartMessage();
        while (true) {
            try {
                action.getConsoleWriter().enterMessage("Enter operation(+, -, *, /) and press enter or type exit for quit");
                String operation = action.getConsoleReader().stringReader();
                if (action.getConsoleReader().exit(operation)) {
                    action.getConsoleWriter().calculatorEndMessage();
                    break;
                } else {
                    action.getConsoleWriter().enterMessage("Enter first number and press enter");
                    double number1 = action.getConsoleReader().doubleReader();
                    action.getConsoleWriter().enterMessage("Enter second number and press enter");
                    double number2 = action.getConsoleReader().doubleReader();
                    action.getConsoleWriter().enterMessage("Result: " + action.getCalcService().calculation(operation, number1, number2));
                }
            } catch (Exception e) {
                throw new WrongEnterException("Incorrect input");
            }
        }
    }
}


