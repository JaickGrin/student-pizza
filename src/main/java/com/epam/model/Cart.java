package com.epam.model;

import com.epam.model.goods.Drink;
import com.epam.model.goods.Goods;
import com.epam.model.goods.Pizza;

import java.util.List;

public class Cart {
    private List<Goods> goodsList;

    public Cart() {
    }

    public Cart(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void addGoods(Goods goods) {
        this.goodsList.add(goods);
    }

    public boolean isLessThanFivePizzas() {
        int pizzasCounter = 0;

        for (Goods goods : goodsList) {
            if (goods instanceof Pizza) {
                pizzasCounter++;
            }
        }

        return pizzasCounter < 5;
    }

    public boolean isLessThanFourDrinks() {
        int drinksCounter = 0;

        for (Goods goods : goodsList) {
            if (goods instanceof Drink) {
                drinksCounter++;
            }
        }

        return drinksCounter < 4;
    }

    public double getTotalCost() {
        int totalCost = 0;

        for (Goods goods : goodsList) {
            totalCost += goods.calculateCost();
        }

        return totalCost;
    }
}
