package com.gmail.ynmatskevich.calculate;


import org.drools.compiler.kie.builder.impl.KieServicesImpl;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * The class cost the price for current weight and distance
 * using drools
 */
public class DeliveryCostWithDrools implements Calculator {
    private double weight;
    private double distance;
    private double price;

    /**
     * Constructor for creating a {@link DeliveryCostWithDrools}
     *
     * @param weight weight of a goods
     * @param distance the distance to which the goods will be delivered
     */
    public DeliveryCostWithDrools(double weight, double distance) {
        isValid(weight);
        isValid(distance);
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double doDeliveryCost() {
        choicePrice(this);
        return weight * distance * price;
    }

    /**
     * Get a price of delivering which is depend on weight via drools
     * and set it to a price field
     */
    private void choicePrice(DeliveryCostWithDrools deliveryCostWithDrools) {
        KieServices ks = KieServicesImpl.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession kieSession = kc.newKieSession("ksession-rules");
        kieSession.insert(deliveryCostWithDrools);
        kieSession.fireAllRules();
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
