package org.example;

public class Burger {

    private String name;
    private double prices;
    private int calories;

    public Burger(String name, double prices, int calories) {
        this.name = name;
        this.prices = prices;
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrices() {
        return prices;
    }

    public int getCalories() {
        return calories;
    }
}
