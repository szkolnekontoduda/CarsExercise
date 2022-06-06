package com.company.things;

import com.company.stuff.Color;
import com.company.stuff.TallVehicle;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Air;
import com.company.stuff.interfaces.Ground;
import com.company.stuff.interfaces.Water;

//dziedziczenie klasy i implementacja interfejsu i implementacja interfejsu
public class FloatPlane extends TallVehicle implements Water, Air {
    public FloatPlane(){}
    //statyczny polimorfizm
    public FloatPlane(Color color, String vehicleName, CombustionEngine engine, int maxHeight, int price) {
        super(color, vehicleName, engine, maxHeight, price);
    }

    @Override //dynamiczny polimorfizm
    public void fly(int speed, int height) {
        if(height <= getMaxHeight() && speed <=getMaxSpeed())
        System.out.println("flying at "+speed+"km/h and at "+height+"meters");
    }

    @Override //dynamiczny polimorfizm
    public void land() {
        System.out.println("Landing");
    }

    @Override //dynamiczny polimorfizm
    public void swim() {
        System.out.println(this.printVehicleName()+" swims (but how?)");
    }
}
