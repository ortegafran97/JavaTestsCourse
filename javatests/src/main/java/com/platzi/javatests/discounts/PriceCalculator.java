package com.platzi.javatests.discounts;


import java.util.ArrayList;

public class PriceCalculator {
    private ArrayList<Double> prices = new ArrayList<>();
    private double discount;

    public double getTotal() {
        double sum = 0.0;
        for (Double price : prices) {
            sum += price;
        }

        return sum * ((100-discount)/100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
