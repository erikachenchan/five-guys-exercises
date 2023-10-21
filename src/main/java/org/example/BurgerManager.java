package org.example;

import java.util.ArrayList;

public class BurgerManager {

    private ArrayList<Burger> burgerList;

    public BurgerManager() {
        this.burgerList = new ArrayList<>();
    }

    public void addBurger(Burger burger) {
        burgerList.add(burger);
    }

    public ArrayList<Burger> getAllBurgers() {
        return burgerList;
    }

    public void removeBurger(Burger burger) {
        burgerList.remove(burger);
    }

    public void clearAllBurgers() {
        burgerList.clear();
    }

    @Override
    public String toString() {
        return "BurgerManager{" +
                "burgerList=" + burgerList +
                '}';
    }
}
