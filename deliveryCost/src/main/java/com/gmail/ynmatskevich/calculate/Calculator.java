package com.gmail.ynmatskevich.calculate;

/**
 * The interface for calculating of a price for delivery.
 * Each implementation has to give there logic of calculating.
 */
public interface Calculator {

    /**
     * Do calculate of a price
     *
     * @return a price of
     */
    double doDeliveryCost();
}
