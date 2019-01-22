package com.gmail.ynmatskevich;

import com.gmail.ynmatskevich.calculate.DeliveryCostWithDrools;
import com.gmail.ynmatskevich.display.DisplayResultConsole;
import com.gmail.ynmatskevich.input.ConsoleInputDataData;
import com.gmail.ynmatskevich.input.InputData;

public class ConsoleDeliveryCostAppDrools {
    public static void main(String[] args) {
        InputData consoleInputData = new ConsoleInputDataData();
        new DisplayResultConsole()
                .displayResult(
                        new DeliveryCostWithDrools(
                                consoleInputData.readUserInput("Enter weight of goods:"),
                                consoleInputData.readUserInput("Enter the distance:")
                        )
                );
    }
}
