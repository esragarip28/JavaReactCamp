package gamerSimulation.entities;

import gamerSimulation.abstracts.Entity;

public class Game implements Entity {
    private int id;
    private String name;
    private double unitsPrice;

    public Game(int id, String name, double unitsPrice) {
        this.id = id;
        this.name = name;
        this.unitsPrice = unitsPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitsPrice() {
        return unitsPrice;
    }

    public void setUnitsPrice(double unitsPrice) {
        this.unitsPrice = unitsPrice;
    }
}
