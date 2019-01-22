package com.gmail.ynmatskevich;

import com.gmail.ynmatskevich.calculate.DeliveryCost;
import com.gmail.ynmatskevich.display.DisplayResultConsole;
import com.gmail.ynmatskevich.input.ConsoleInputDataData;
import com.gmail.ynmatskevich.input.InputData;

/**
 * A console app for costing of cost of delivery of goods
 */
public class ConsoleDeliveryCostApp {
    public static void main(String[] args) {
        InputData consoleInputData = new ConsoleInputDataData();
        new DisplayResultConsole()
                .displayResult(
                        new DeliveryCost(
                                consoleInputData.readUserInput("Enter weight of goods:"),
                                consoleInputData.readUserInput("Enter the distance:")
                        )
                );
    }
}
