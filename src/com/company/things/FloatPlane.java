package com.company.things;

import com.company.stuff.Color;
import com.company.stuff.TallVehicle;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Air;
import com.company.stuff.interfaces.Ground;
import com.company.stuff.interfaces.Water;

public class FloatPlane extends TallVehicle implements Air, Water {


    public FloatPlane(Color color, String vehicleName, CombustionEngine engine, int maxHeight, int price) {
        super(color, vehicleName, engine, maxHeight, price);
    }

    @Override
    public void fly(int speed, int height) {
        System.out.println("flying at "+speed+"km/h and at "+height+"meters");
    }

    @Override
    public void land() {
        System.out.println("Landing in water");
    }

    @Override
    public void swim() {
        System.out.println(this.printVehicleName()+" swims (but how?)");
    }
}
