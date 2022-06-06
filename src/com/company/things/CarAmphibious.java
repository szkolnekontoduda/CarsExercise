package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.Engine;
import com.company.stuff.interfaces.Ground;
import com.company.stuff.interfaces.Water;

//dziedziczenie klasy i implementacja interfejsu i implementacja interfejsu
public class CarAmphibious extends BaseVehicle implements Ground, Water {
    public CarAmphibious(){}
    //statyczny polimorfizm
    public CarAmphibious(Color color, String vehicleName, Engine engine, int price) {
        super(color, vehicleName, engine, price);
    }


    @Override //dynamiczny polimorfizm
    public void drive() {
        System.out.println("...and now driving!");
    }

    @Override //dynamiczny polimorfizm
    public void swim() {
        System.out.println("...and now swimming!");
    }
}
