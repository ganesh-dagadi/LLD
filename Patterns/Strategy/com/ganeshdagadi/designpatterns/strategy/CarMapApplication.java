package com.ganeshdagadi.designpatterns.strategy;

public class CarMapApplication extends MapApplication {

    CarMapApplication() {
        super(new AStarPathFinderStrategy());
    }

}