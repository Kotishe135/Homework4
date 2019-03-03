package com.company;

public class Train extends Community{

    private boolean electricity = false;

    public Train(String brand, String model, int numberOfSeats, int priceTicket, int countDoor, int countWheels) {
        super(brand, model, numberOfSeats, priceTicket, countDoor, countWheels);
    }

    public void setElectricity(){
        electricity = true;
    }

    @Override
    public void refuel(double liters) {
        System.out.println("Я электричка, мне не нужно топливо");
    }

    @Override
    public double getFuel() {
        System.out.println("Я электричка, у меня нет топлива");
        return 0;
    }

    @Override
    public void moveForward() {
        if (engineIsStart) {
            for (int i = 0; i < wheels.length; i++) {
                wheels[i].spinForward();
            }
            System.out.println("Поезд едет вперёд по рельсам");
        }
    }

    @Override
    public void moveBack() {
        if (engineIsStart) {
            for (int i = 0; i < wheels.length; i++) {
                wheels[i].spinBack();
            }
            System.out.println("Поезд едет назад по рельсам");
        }
    }

    @Override
    public void startTheEngine(){
        if (electricity){
            engineIsStart = true;
            System.out.println("Двигатель запущен");
        }else{
            System.out.println("Не подключено электричество, двигатель не запущен");
        }
    }
}
