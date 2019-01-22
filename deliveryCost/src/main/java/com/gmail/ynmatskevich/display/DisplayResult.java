package com.gmail.ynmatskevich.display;

import com.gmail.ynmatskevich.calculate.Calculator;

/**
 * This interface is intended to display result message
 */
public interface DisplayResult {

    /**
     * Display a result of calculation
     *
     * @param costCalculator an object inherited of {@link Calculator}
     */
    void displayResult(Calculator costCalculator);
}
