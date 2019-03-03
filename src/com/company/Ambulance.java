package com.company;

public class Ambulance extends Specific{

    public Ambulance(String brand, String model, int countOfGear, int countWheels) {
        super(brand, model, countOfGear, countWheels);
    }

    @Override
    public void supplyWater() {
        System.out.println("Я скорая, я так не умею");
    }

    @Override
    public void flasherOn() {
        flasher = true;
        System.out.println("Синий проблесковый маячок включен");
    }
}
