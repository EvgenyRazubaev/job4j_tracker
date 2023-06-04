package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int qtyPass);

    int fuelCharge(int fuel);
}
