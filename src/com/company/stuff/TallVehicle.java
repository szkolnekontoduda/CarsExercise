package com.company.stuff;

import com.company.stuff.engines.ActualEngine;

//dziedziczenie klasy
public class TallVehicle extends BaseVehicle{
    //enkapsulacja
    private int maxHeight;

    public TallVehicle(){}
    //statyczny polimorfizm
    public TallVehicle(Color color, String vehicleName, ActualEngine engine, int maxHeight, int price) {
        super(color, vehicleName, engine, price);
        this.maxHeight = maxHeight;
    }

    //gettery i settery
    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        if(maxHeight >= 0)
        this.maxHeight = maxHeight;
    }
}
