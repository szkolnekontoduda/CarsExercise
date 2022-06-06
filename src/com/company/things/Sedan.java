package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Ground;

//dziedziczenie klasy i implementacja interfejsu
public class Sedan extends BaseVehicle implements Ground {
    public Sedan(){}
    //statyczny polimorfizm
    public Sedan(Color color, String vehicleName, CombustionEngine combustionEngine, int price) {
        super(color, vehicleName, combustionEngine, price);
    }


    @Override //dynamiczny polimorfizm
    public void drive() {
        System.out.println(this.printVehicleName()+" drives somewhere");
    }
}
