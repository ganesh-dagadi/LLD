package com.ganeshdagadi.designpatterns.strategy;

public class BusMapApplication extends MapApplication {

    BusMapApplication() {
        super(new DjikstraPathFinderStrategy());
    }

}