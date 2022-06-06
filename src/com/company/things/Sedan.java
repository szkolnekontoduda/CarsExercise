package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Ground;

public class Sedan extends BaseVehicle implements Ground {

    public Sedan(Color color, String vehicleName, CombustionEngine combustionEngine, int price) {
        super(color, vehicleName, combustionEngine, price);
    }


    @Override
    public void drive() {
        System.out.println(this.printVehicleName()+" drives somewhere");
    }
}
