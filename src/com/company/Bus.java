package com.company;

public class Bus extends Community {

    public Bus(String brand, String model, int numberOfSeats, int priceTicket, int countDoor, int countWheels) {
        super(brand, model, numberOfSeats, priceTicket, countDoor, countWheels);
    }

    @Override
    public void refuel(double liters) {
        fuel += liters;
    }

    @Override
    public double getFuel() {
        return fuel;
    }

    @Override
    public void moveForward() {
        if (engineIsStart) {
            for (int i = 0; i < countWheels; i++) {
                wheels[i].spinForward();
            }
        }
    }

    @Override
    public void moveBack() {
        if (engineIsStart) {
            for (int i = 0; i < countWheels; i++) {
                wheels[i].spinBack();
            }
        }
    }
}
