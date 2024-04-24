package com.oops.abstrct;

public class Car extends  Vehicle{

    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getNumberOfWheels());

    }
}
