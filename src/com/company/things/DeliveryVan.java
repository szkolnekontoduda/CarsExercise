package com.company.things;

import com.company.stuff.BaseVehicle;
import com.company.stuff.Color;
import com.company.stuff.engines.ActualEngine;
import com.company.stuff.engines.CombustionEngine;
import com.company.stuff.interfaces.Ground;

public class DeliveryVan extends BaseVehicle implements Ground {

    public DeliveryVan(Color color, String vehicleName, CombustionEngine engine, int price) {
        super(color, vehicleName, engine, price);
    }

    @Override
    public void drive() {
        System.out.println(this.printVehicleName()+" drives and delivers something somewhere");
    }
}
