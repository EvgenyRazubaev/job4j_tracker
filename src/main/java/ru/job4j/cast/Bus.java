package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Бип-бип");
    }

    @Override
    public void passengers() {
        System.out.println("В Автобусе 48 пассажиров");
    }
}
