package com.ganeshdagadi.designpatterns.strategy;

import com.ganeshdagadi.designpatterns.strategy.PathFindingStrategy;

public class DjikstraPathFinderStrategy implements PathFindingStrategy{
    @Override
    public void generatePath() {
        System.out.println("Djikstra path finder");
    }
}
