package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.Engine;
import com.company.stuff.engines.Legs;
import com.company.stuff.interfaces.Ground;

//dziedziczenie klasy i implementacja interfejsu
public class Bicycle extends BaseVehicle implements Ground {
    public Bicycle(){}
    //statyczny polimorfizm
    public Bicycle(Color color, String vehicleName, Legs legs, int price) {
        super(color, vehicleName, legs, price);
    }

    @Override //dynamiczny polimorfizm
    public void drive() {
        System.out.println("Eco driving!");
    }
}
