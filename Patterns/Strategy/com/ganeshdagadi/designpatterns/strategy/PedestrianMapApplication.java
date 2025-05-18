package com.ganeshdagadi.designpatterns.strategy;

public class PedestrianMapApplication extends MapApplication {

    PedestrianMapApplication() {
        super(new AStarPathFinderStrategy());
    }

}