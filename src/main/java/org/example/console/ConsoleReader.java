package org.example.console;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {

    public double doubleReader() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public String stringReader() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public boolean exit(String operation) {
        return operation.equals("exit");
    }
}
