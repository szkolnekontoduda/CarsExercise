package com.company.stuff;

import com.company.stuff.engines.Engine;

public class BaseVehicle extends Thing{
    private String vehicleName;
    public final Color color;
    public final Engine engine;
    private int maxSpeed;


    public BaseVehicle(Color color, String vehicleName, Engine engine, int price){
        super(price);
        this.color = color;
        this.vehicleName = vehicleName;
        this.engine = engine;
    }

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
}
