package com.company.things;

import com.company.stuff.Color;
import com.company.stuff.TallVehicle;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Air;
import com.company.stuff.interfaces.Ground;

public class JetFighter extends TallVehicle implements Air, Ground {


    public JetFighter(Color color, String vehicleName, CombustionEngine engine, int maxHeight, int price) {
        super(color, vehicleName, engine, maxHeight, price);
    }

    @Override
    public void fly(int speed, int height) {
        System.out.println(this.printVehicleName()+" flies at "+speed+"km/h "+height+"mag and jet-fights (pun intended)");
    }

    @Override
    public void land() {
        System.out.println("LANDIN' FOLKS");
    }


    @Override
    public void drive() {
        System.out.println("driving on airports funny tiny roads");
    }
}
