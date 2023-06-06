package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Чух-чух");
    }

    @Override
    public void passengers() {
        System.out.println("По вагонам 300 пассажиров");
    }
}
