package com.company.things;

import com.company.stuff.Color;
import com.company.stuff.TallVehicle;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Air;
import com.company.stuff.interfaces.Ground;

//dziedziczenie klasy i implementacja interfejsu i implementacja interfejsu
public class JetFighter extends TallVehicle implements Air, Ground {
    public JetFighter(){}
    //statyczny polimorfizm
    public JetFighter(Color color, String vehicleName, CombustionEngine engine, int maxHeight, int price) {
        super(color, vehicleName, engine, maxHeight, price);
    }

    @Override //dynamiczny polimorfizm
    public void fly(int speed, int height) {
        if(height <= getMaxHeight() && speed <=getMaxSpeed())
        System.out.println(this.printVehicleName()+" flies at "+speed+"km/h "+height+"mag and jet-fights");
    }

    @Override //dynamiczny polimorfizm
    public void land() {
        System.out.println("LANDIN' FOLKS");
    }


    @Override //dynamiczny polimorfizm
    public void drive() {
        System.out.println("driving on airports funny tiny roads");
    }
}
