package com.epam.model.goods;

public class Drink extends Goods {
    private double volume;

    public Drink() {
        super();
    }

    public Drink(String name, NutritionFacts nutritionFacts, double cost, int quantity, double volume) {
        super(name, nutritionFacts, cost, quantity);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
