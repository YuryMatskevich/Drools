package com.gmail.ynmatskevich.calculate;

/**
 * The class cost the price for current weight and distance
 */
public class DeliveryCost implements Calculator, DeliveryCostPrice {
    private double weight;
    private double distance;

    /**
     * Constructor for creating a {@link DeliveryCost}
     *
     * @param weight weight of a goods
     * @param distance the distance to which the goods will be delivered
     */
    public DeliveryCost(double weight, double distance) {
        isValid(weight);
        isValid(distance);
        this.weight = weight;
        this.distance = distance;
    }

    /**
     * Count cost of delivery
     *
     * @return cost of delivery
     */
    @Override
    public double doDeliveryCost() {
        return weight * distance * choicePrice();
    }

    /**
     * Get a price of delivering which is depend on weight
     *
     * @return a price
     */
    private double choicePrice() {
        double price;
        if (weight <= LESS_THAN_10_KG) {
            price = LESS_THAN_10_KG;
        } else if (LESS_THAN_10_KG < weight && weight < MORE_THAN_30_KG) {
            price = BETWEEN_10_30_KG;
        } else {
            price = MORE_THAN_30_KG;
        }
        return price;
    }

    /**
     * Check if the value is valid
     *
     * @param value a value is being checked
     */
    private void isValid(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException(
                    String.format("The value can not be negative: value = %s", value)
            );
        }
    }
}
