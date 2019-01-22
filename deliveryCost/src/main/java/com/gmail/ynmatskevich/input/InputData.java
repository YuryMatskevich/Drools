package com.gmail.ynmatskevich.input;

/**
 * This interface contains a method for
 * read of user's input of
 */
public interface InputData {

    /**
     * Reads user's input
     *
     * @param msg a message to display before user's input
     * @return a valid double value
     */
    double readUserInput(String msg);
}
