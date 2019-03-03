package com.company;

public abstract class Specific implements Transport{
    public String brand;
    public String model;
    protected Wheel[] wheels;
    protected int countOfGear;
    protected int gear = 0;
    protected boolean engineIsStart = false;
    protected boolean flasher = false;

    public Specific(String brand, String model, int countOfGear, int countWheels){
        this.brand = brand;
        this.model = model;
        this.countOfGear = countOfGear;
        wheels = new Wheel[countWheels];
        for (int i = 0; i < countWheels; i++){
            wheels[i] = new Wheel(String.valueOf(i));
        }
    }

    public abstract void supplyWater();

    public abstract void flasherOn();

    public void flasherOff(){
        flasher = false;
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

    public void shiftGearUp() {
        if (gear < countOfGear){
            gear++;
        }
    }

    public void shiftGearDown() {
        if (gear > -1){
            gear--;
        }
    }

    @Override
    public void startTheEngine(){
        engineIsStart = true;
        System.out.println("Двигатель запущен");
    }

    @Override
    public void stopTheEngine() {
        engineIsStart = false;
        System.out.println("Двигатель остановлен");
    }

    @Override
    public void moveForward() {
        if (engineIsStart && gear == 1){
            for (int i = 0; i < wheels.length;i++){
                wheels[i].spinForward();
            }
            System.out.println("Поехали вперёд");
        }
    }

    @Override
    public void moveBack() {
        if (engineIsStart && gear == -1){
            for (int i = 0; i < wheels.length;i++){
                wheels[i].spinBack();
            }
            System.out.println("Поехали назад");
        }
    }

}
