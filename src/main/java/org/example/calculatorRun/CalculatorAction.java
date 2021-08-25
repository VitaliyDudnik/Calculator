package org.example.calculatorRun;

import org.example.console.ConsoleReader;
import org.example.console.ConsoleWriter;
import org.example.service.CalcService;
import org.springframework.stereotype.Component;

@Component
public class CalculatorAction {
    private ConsoleReader consoleReader = new ConsoleReader();
    private ConsoleWriter consoleWriter = new ConsoleWriter();
    private CalcService calcService = new CalcService();

    public CalculatorAction(ConsoleReader consoleReader, ConsoleWriter consoleWriter, CalcService calcService) {
        this.consoleReader = consoleReader;
        this.consoleWriter = consoleWriter;
        this.calcService = calcService;
    }

    public CalculatorAction() {

    }

    public ConsoleReader getConsoleReader() {
        return consoleReader;
    }

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }

    public CalcService getCalcService() {
        return calcService;
    }
}
