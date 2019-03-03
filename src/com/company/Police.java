package com.company;

public class Police extends Specific {

    public Police(String brand, String model, int countOfGear, int countWheels) {
        super(brand, model, countOfGear, countWheels);
    }

    @Override
    public void supplyWater() {
        System.out.println("Я так не могу, я из полиции");
    }

    @Override
    public void flasherOn() {
        flasher = true;
        System.out.println("Сине-красный проблесковый маячок включен");
    }
}
