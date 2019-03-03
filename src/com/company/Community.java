package com.company;

public abstract class Community implements Transport{
    public String brand;
    public String model;
    protected boolean engineIsStart = false;
    protected int numberOfSeats;
    protected Wheel[] wheels;
    protected int countWheels;
    protected double fuel;
    protected int priceTicket;
    protected int countDoor;
    protected boolean isOpenned;

    public Community(String brand, String model, int numberOfSeats, int priceTicket, int countDoor, int countWheels){
        this.brand = brand;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.priceTicket = priceTicket;
        this.countDoor = countDoor;
        this.countWheels = countWheels;
        wheels = new Wheel[countWheels];
        for (int i = 0; i < countWheels; i++){
            wheels[i] = new Wheel(String.valueOf(i));
        }
    }

    protected class Wheel{
        private String location;
        public Wheel(String location){
            this.location = location;
        }

        public void spinForward(){
            System.out.println(location + " колесо вращается вперёд");
        }

        public void spinBack(){
            System.out.println(location + " колесо вращается назад");
        }
    }

    public void openTheDoor(){
        isOpenned = true;
        System.out.println("Двери открыты");
    }

    public void closeTheDoor() {
        isOpenned = false;
        System.out.println("Двери закрыты");
    }

    public abstract void refuel(double liters);

    public abstract double getFuel();

    @Override
    public void startTheEngine(){
        if (getFuel() > 0) {
            engineIsStart = true;
            System.out.println("Двигатель запущен");
        }else{
            System.out.println("Двигатель не запущен, нет топлива");
        }
    }

    @Override
    public void stopTheEngine() {
        engineIsStart = false;
        System.out.println("Двигатель остановлен");
    }
}
