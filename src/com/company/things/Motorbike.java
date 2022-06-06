package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.Engine;
import com.company.stuff.interfaces.Ground;

public class Motorbike extends BaseVehicle implements Ground {
    public Motorbike(Color color, String vehicleName, Engine engine, int price) {
        super(color, vehicleName, engine, price);
    }

    @Override
    public void drive() {
        System.out.println("Drivin' (motorbike>bicycle)");
    }
}
