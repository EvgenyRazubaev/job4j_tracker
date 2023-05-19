package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private String extraCheese = " + Extra Cheese";

    @Override
    public String name() {
        return super.name() + extraCheese;
    }
}
