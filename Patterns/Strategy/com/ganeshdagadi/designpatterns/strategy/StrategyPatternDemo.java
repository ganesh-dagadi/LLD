package com.ganeshdagadi.designpatterns.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        MapApplication carMapApplication = new CarMapApplication();
        System.out.println("Car Map app uses");
        carMapApplication.generatePath();

        MapApplication busMapApplication = new BusMapApplication();
        System.out.println("Bus Map app uses");
        busMapApplication.generatePath();
    }
}