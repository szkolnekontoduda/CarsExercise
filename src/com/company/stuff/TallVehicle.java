package com.company.stuff;

import com.company.stuff.engines.ActualEngine;

public class TallVehicle extends BaseVehicle{
    public final int maxHeight;

    public TallVehicle(Color color, String vehicleName, ActualEngine engine, int maxHeight, int price) {
        super(color, vehicleName, engine, price);
        this.maxHeight = maxHeight;
    }
}
