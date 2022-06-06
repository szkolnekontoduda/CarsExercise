package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.ElectricEngine;
import com.company.stuff.interfaces.Ground;

public class Tram extends BaseVehicle implements Ground {

    public Tram(Color color, String vehicleName, ElectricEngine engine, int price) {
        super(color, vehicleName, engine, price);
    }

    @Override
    public void drive() {
        System.out.println(this.printVehicleName()+" isn't a train, yet it still drives somewhere");
    }
}
