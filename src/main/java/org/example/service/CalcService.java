package org.example.service;

import org.example.Operation;
import org.example.exception.WrongOperation;
import org.example.operators.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CalcService {
    private final Map<String, Operation> operationMap = OperatorMap.addOperatorsToMap();

    public double calculation(String operation, double number1, double number2) {
        Operation operationMapValue = operationMap.getOrDefault(operation, new WrongOperation(operation));
        return operationMapValue.calculate(number1, number2);
    }
}
