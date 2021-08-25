package org.example.operators;

import org.example.Operation;
import org.springframework.stereotype.Component;

@Component
public class Multiplication implements Operation {
    @Override
    public double calculate(double number1, double number2) {
        return number1 * number2;
    }

}
