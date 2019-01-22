package com.gmail.ynmatskevich.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class DeliveryCostTest {
    private Calculator deliveryCost;

    @Test
    public void ifPriceLessThan10() {
        deliveryCost = new DeliveryCost(8, 10);
        assertThat(800.0, is(deliveryCost.doDeliveryCost()));
    }

    @Test
    public void ifPriceLessEqual10() {
        deliveryCost = new DeliveryCost(10, 10);
        assertThat(1000.0, is(deliveryCost.doDeliveryCost()));
    }

    @Test
    public void ifPriceLessBetween10and30() {
        deliveryCost = new DeliveryCost(15, 10);
        assertThat(2250.0, is(deliveryCost.doDeliveryCost()));
    }

    @Test
    public void ifPriceMoreThan30() {
        deliveryCost = new DeliveryCost(40, 10);
        assertThat(10000.0, is(deliveryCost.doDeliveryCost()));
    }

    @Test
    public void ifPriceLessEqual30() {
        deliveryCost = new DeliveryCost(30, 10);
        assertThat(7500.0, is(deliveryCost.doDeliveryCost()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifWeightIsNegativeThenThrowException() {
        deliveryCost = new DeliveryCost(-10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifDistanceIsNegativeThenThrowException() {
        deliveryCost = new DeliveryCost(10, -10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifWeightEqualsNullThenThrowException() {
        deliveryCost = new DeliveryCost(0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifDistanceEqualsNullThenThrowException() {
        deliveryCost = new DeliveryCost(10, 0);
    }
}