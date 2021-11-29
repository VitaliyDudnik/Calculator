package org.example.operators;

import org.example.Operation;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class OperatorMap {
    public static Map<String, Operation> addOperatorsToMap() {
        Map<String, Operation> operationMap = new HashMap<>();
        operationMap.put("+", new Sum());
        operationMap.put("-", new Subtraction());
        operationMap.put("*", new Multiplication());
        operationMap.put("/", new Division());
        return new HashMap<>(operationMap);
    }
}
