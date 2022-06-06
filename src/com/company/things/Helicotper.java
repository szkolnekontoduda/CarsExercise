package com.company.things;

import com.company.stuff.Color;
import com.company.stuff.TallVehicle;
import com.company.stuff.engines.ActualEngine;
import com.company.stuff.interfaces.Air;

public class Helicotper extends TallVehicle implements Air {
    public Helicotper(Color color, String vehicleName, ActualEngine engine, int maxHeight, int price) {
        super(color, vehicleName, engine, maxHeight, price);
    }

    @Override
    public void fly(int speed, int height) {
        System.out.println("spd: "+speed+" h: "+height);
    }

    @Override
    public void land() {
        System.out.println("'nam time!");
    }
}
