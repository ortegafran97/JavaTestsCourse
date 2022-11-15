package com.platzi.javatests.discounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorShould {
    PriceCalculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new PriceCalculator();
    }

    @Test
    public void get_zero_when_there_are_no_prices() {
        assertEquals(0.0, calculator.getTotal());
    }

    @Test
    public void get_sum_of_the_prices() {
        calculator.addPrice(10.0);
        calculator.addPrice(12.0);

        assertEquals(22.0,calculator.getTotal());
    }

    @Test
    public void get_total_with_discount() {
        calculator.addPrice(10.0);
        calculator.addPrice(20.0);
        calculator.addPrice(70.0);

        calculator.setDiscount(25.0);

        assertEquals(75.0,calculator.getTotal());

    }
}