package com.gmail.ynmatskevich.calculate;

/**
 * This interface contains range of price for
 * different weight for delivery distance of 1km
 */
public interface DeliveryCostPrice {
    double LESS_THAN_10_KG = 10.0; //less or equal 10kg
    double BETWEEN_10_30_KG = 15.0;
    double MORE_THAN_30_KG = 25.0; //more or equal 30kg
}
