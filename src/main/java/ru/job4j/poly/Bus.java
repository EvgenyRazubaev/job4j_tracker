package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int qtyPass) {
        System.out.println("В Автобусе " + qtyPass + " Пассажиров.");
    }

    @Override
    public int fuelCharge(int fuel) {
        return 50 * fuel;
    }
}
