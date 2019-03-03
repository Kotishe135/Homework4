package com.company;

public class Firetruck extends Specific{
    protected int water = 0;
    protected int maxLiters = 200;

    public Firetruck(String brand, String model, int countOfGear, int countWheels) {
        super(brand, model, countOfGear, countWheels);
    }

    public void takeWater(){
        water = maxLiters;
    }

    @Override
    public void supplyWater() {
        System.out.println("Пшшшшшшш");
    }

    @Override
    public void flasherOn() {
        flasher = true;
        System.out.println("Синий проблесковый маячок включен");
    }
}
