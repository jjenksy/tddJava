package com.logicode.coffee;

/**
 * Describes the type of coffee that we're going to serve.
 */
public enum CoffeeType {
    Espresso(7, 0),//Espresso with 7 beans and 0 milk args to match the constructor
    Latte(7, 227),//Latte with 7 beans and 227 milk args to match the constructor
    FilterCoffee(10, 0);//FilterCoffee with 10 beans and 0 milk args to match the constructor

    private final int requiredBeans;
    private final int requiredMilk;

    CoffeeType(int requiredBeans, int requiredMilk) {
        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }
}
