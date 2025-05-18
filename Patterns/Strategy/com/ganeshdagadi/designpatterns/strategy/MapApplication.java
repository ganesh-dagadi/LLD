package com.ganeshdagadi.designpatterns.strategy;

public abstract class MapApplication {
    PathFindingStrategy pathFinderStrategy;

    MapApplication(PathFindingStrategy pathFinderStrategy) {
        this.pathFinderStrategy = pathFinderStrategy;
    }
    void generatePath(){
        pathFinderStrategy.generatePath();
    };
}