package org.example.operators;

import org.example.Operation;
import org.example.exception.WrongEnterException;
import org.springframework.stereotype.Component;

@Component
public class Division implements Operation {

    @Override
    public double calculate(double number1, double number2) {
        if(number2 != 0.0) {
            return number1 / number2;
        }else {
            throw new WrongEnterException("Cannot be divided by zero");
        }
    }
}
