package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Вжух в небо");
    }

    @Override
    public void passengers() {
        System.out.println("На борту 130 пассажиров");
    }
}
