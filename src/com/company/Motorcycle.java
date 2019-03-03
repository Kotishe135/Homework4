package com.company;

public class Motorcycle extends Personal {

    public Motorcycle(String brand, String model, int countDoor, int countOfGear, int countWheels) {
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
        if (gear > 0){
            gear--;
        }
    }

    @Override
    public void moveForward() {
        if (engineIsStart && gear == 1){
            for (int i = 0; i < wheels.length; i++){
                wheels[i].spinForward();
            }
            System.out.println("Мотоцикл тронулся и поехал вперёд");
        }else{
            System.out.print("Можете катить мотоцикл ногами");
            if (!engineIsStart){
                System.out.println(" или заведите двигатель и включите первую передачу");
            }else{
                System.out.println(" или включите первую передачу и попробуйте ещё раз");
            }
        }
    }

    @Override
    public void moveBack() {
        System.out.println("Назад можно только отталкиваясь ногами");
    }
}
