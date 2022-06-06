package com.company.stuff.engines;

import com.company.stuff.Thing;

public class ElectricEngine extends Thing implements ActualEngine{


    public ElectricEngine(int price) {
        super(price);
    }

    @Override
    public void launch() {
        System.out.println("Bz bzzzzzz...");
    }

    @Override
    public void stop() {
        System.out.println("zzzb Zb.");
    }

    @Override
    public void sound() {
        System.out.println("Bz Bz Bz");
    }
}
