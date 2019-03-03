package com.company;

public abstract class Personal implements Transport{
    public String brand;
    public String model;
    protected int countDoor;
    protected Wheel[] wheels;
    protected int countOfGear;
    protected  int gear = 0;
    protected boolean engineIsStart = false;

    public Personal(String brand, String model, int countDoor, int countOfGear, int countWheels){
        this.brand = brand;
        this.model = model;
        this.countDoor = countDoor;
        this.countOfGear = countOfGear;
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

    public abstract void shiftGearUp();

    public abstract void shiftGearDown();

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


}