package org.example.exception;

import org.example.Operation;

public class WrongOperation implements Operation {
    private final String operator;

    public WrongOperation(String operator) {
        this.operator = operator;
    }

    @Override
    public double calculate(double number1, double number2) {
    throw new WrongEnterException("Incorrect operator: " + operator);
    }
}
