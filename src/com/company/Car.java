package com.company;

public class Car extends Personal {
    public Car(String brand, String model, int countDoor, int countOfGear, int countWheels) {
        super(brand, model, countDoor, countOfGear, countWheels);
    }

    @Override
    public void shiftGearUp() {
        if (gear < countOfGear){
            gear++;
        }
    }

    @Override
    public void shiftGearDown() {
        if (gear > -1){
            gear--;
        }
    }

    @Override
    public void moveForward() {
        if (engineIsStart && gear == 1){
            for (int i = 0; i < wheels.length;i++){
                wheels[i].spinForward();
            }
            System.out.println("Автомобиль тронулся и поехал вперёд");
        }
    }

    @Override
    public void moveBack() {
        if (engineIsStart && gear == -1){
            for (int i = 0; i < wheels.length;i++){
                wheels[i].spinBack();
            }
            System.out.println("Автомобиль тронулся и поехал назад");
        }
    }
}
