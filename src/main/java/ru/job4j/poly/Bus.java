package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void drive() {
        System.out.println("Автобус поехал");
    }

    @Override
    public void passenger(int man) {
        System.out.println(man + "пассажиров в салоне");
    }

    @Override
    public int refuel(int price) {
        System.out.println("Заправились на " + price + "рублей, 48 рублей за литр.");
        return price / 48;
    }

    @Override
    public void move() {
        System.out.println("Автобус двигается по трассам");
    }
}
