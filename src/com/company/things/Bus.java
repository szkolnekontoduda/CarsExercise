package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Ground;

//dziedziczenie klasy i implementacja interfejsu
public class Bus extends BaseVehicle implements Ground {
    public Bus(){}
    //statyczny polimorfizm
    public Bus(Color color, String vehicleName, CombustionEngine engine, int price) {
        super(color, vehicleName, engine, price);
    }

    @Override //dynamiczny polimorfizm
    public void drive() {
        System.out.println(this.printVehicleName()+" drives to another stop");
    }
}
