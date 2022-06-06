package com.company.things;

import com.company.stuff.Color;
import com.company.stuff.TallVehicle;
import com.company.stuff.engines.ActualEngine;
import com.company.stuff.interfaces.Air;

//dziedziczenie klasy i implementacja interfejsu
public class Helicotper extends TallVehicle implements Air {
    public Helicotper(){}
    //statyczny polimorfizm
    public Helicotper(Color color, String vehicleName, ActualEngine engine, int maxHeight, int price) {
        super(color, vehicleName, engine, maxHeight, price);
    }

    @Override //dynamiczny polimorfizm
    public void fly(int speed, int height) {
        if(height <= getMaxHeight() && speed <= getMaxSpeed())
        System.out.println("spd: "+speed+" h: "+height);
    }

    @Override //dynamiczny polimorfizm
    public void land() {
        System.out.println("'nam time!");
    }
}
