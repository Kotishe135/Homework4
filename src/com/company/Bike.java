package com.company;

public class Bike extends Personal{
    public Bike(String brand, String model, int countDoor, int countOfGear, int countWheels) {
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
        if (gear > 1){
            gear--;
        }
    }

    @Override
    public void moveForward() {
        System.out.println("Крути педали, поехали");
    }

    @Override
    public void moveBack() {
        System.out.println("Толкайте ногами землю, чтобы ехать назад");
    }

    @Override
    public void startTheEngine(){
        System.out.println("У велосипеда двигатель - Ваши ноги, так что крути педали, пока... кхм, ну Вы поняли");
    }

    @Override
    public void stopTheEngine() {
        System.out.println("Да, так и быть, я разрешаю Вам встать с велосипеда");
    }
}
