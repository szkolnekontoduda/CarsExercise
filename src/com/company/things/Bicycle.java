package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.Engine;
import com.company.stuff.engines.Legs;
import com.company.stuff.interfaces.Ground;

public class Bicycle extends BaseVehicle implements Ground {
    public Bicycle(Color color, String vehicleName, Legs legs, int price) {
        super(color, vehicleName, legs, price);
    }

    @Override
    public void drive() {
        System.out.println("Eco driving!");
    }
}
