package com.company.stuff;

import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.engines.Engine;

import static com.company.stuff.Color.RED;

//dziedziczenie klasy
public class BaseVehicle extends Thing{
    //enkapsulacja
    private String vehicleName;
    private Color color;
    private Engine engine;
    private int maxSpeed;

    public BaseVehicle(){}
    //statyczny polimorfizm
    public BaseVehicle(Color color, String vehicleName, Engine engine, int price){
        super(price);
        this.color = color;
        this.vehicleName = vehicleName;
        this.engine = engine;
    }

    //gettery i settery
    public String printVehicleName(){
        return this.vehicleName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed >= 0)
        this.maxSpeed = maxSpeed;
    }

    public void setVehicleName(String vehicleName){
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
