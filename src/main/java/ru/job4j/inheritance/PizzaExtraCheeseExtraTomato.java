package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private String extraTomato = " + Extra tomato";

    @Override
    public String name() {
        return super.name() + extraTomato;
    }
}
