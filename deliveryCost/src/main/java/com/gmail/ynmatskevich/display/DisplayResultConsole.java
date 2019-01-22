package com.gmail.ynmatskevich.display;

import com.gmail.ynmatskevich.calculate.Calculator;

/**
 * This class display result to the Console
 */
public class DisplayResultConsole implements DisplayResult {

    @Override
    public void displayResult(Calculator costCalculator) {
        String msg = "Resulted cost:";
        System.out.println(
                String.format("%s\n%.2f", msg, costCalculator.doDeliveryCost())
        );
    }
}
