package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.Engine;
import com.company.stuff.interfaces.Ground;
import com.company.stuff.interfaces.Water;

public class CarAmphibious extends BaseVehicle implements Ground, Water {

    public CarAmphibious(Color color, String vehicleName, Engine engine, int price) {
        super(color, vehicleName, engine, price);
    }


    @Override
    public void drive() {
        System.out.println("...and now driving!");
    }

    @Override
    public void swim() {
        System.out.println("...and now swimming!");
    }
}
