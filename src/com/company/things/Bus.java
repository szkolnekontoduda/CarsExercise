package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Ground;

public class Bus extends BaseVehicle implements Ground {

    public Bus(Color color, String vehicleName, CombustionEngine engine, int price) {
        super(color, vehicleName, engine, price);
    }

    @Override
    public void drive() {
        System.out.println(this.printVehicleName()+" drives to another stop");
    }
}
