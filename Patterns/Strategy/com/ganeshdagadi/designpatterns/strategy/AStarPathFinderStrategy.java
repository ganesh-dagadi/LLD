package com.ganeshdagadi.designpatterns.strategy;

import com.ganeshdagadi.designpatterns.strategy.PathFindingStrategy;

public class AStarPathFinderStrategy implements PathFindingStrategy{
    
    @Override
    public void generatePath() {
        System.out.println("A* path finder");
    }
}
