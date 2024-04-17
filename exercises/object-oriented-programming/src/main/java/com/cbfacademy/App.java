package com.cbfacademy;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Showroom showroom = new Showroom();
        var cars = showroom.getCars();

        for (Car car : cars) {
            System.out.println(String.format("a %s %s %s from %d", car.getColour(), car.getMake(), car.getModel(), car.getYear()));
        }
    }
}
