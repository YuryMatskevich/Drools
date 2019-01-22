package com.gmail.ynmatskevich.input;

import java.util.Scanner;

/**
 * This class contains method for userInput
 */
public class ConsoleInputDataData implements InputData {

    public ConsoleInputDataData() {

    }

    /**
     * The method reads users input
     *
     * @param msg a message to display
     * @return a price in double format which was typed by a user
     */
    @Override
    public double readUserInput(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return getValidValue(in);
    }

    /**
     * Get user's value if input contains a valid one. If it does not contain
     * the valid value so it display error message and user get a chance to type
     * one more time
     *
     * @param in a <code>Scanner</code> associated with standard input
     * @return a valid value
     */
    private double getValidValue(Scanner in) {
        String errorMsg = "Enter a correct value!";
        double value;
        while (!in.hasNextDouble()) {
            in.nextLine();
            System.out.println(errorMsg);
        }
        while ((value = in.nextDouble()) <= 0) {
            in.nextLine();
            System.out.println(errorMsg);
        }
        return value;
    }
}
