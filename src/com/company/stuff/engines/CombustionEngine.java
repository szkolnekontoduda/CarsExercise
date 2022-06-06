package com.company.stuff.engines;

import com.company.stuff.Thing;

public class CombustionEngine extends Thing implements ActualEngine{
    public final int maxCapacity;
    private int capacity;

    public CombustionEngine(int maxCapacity, int price){
        super(price);

        this.maxCapacity = maxCapacity;
    }

    @Override
    public void launch() {
        System.out.println("Wr wrrrrrr...");
    }

    @Override
    public void stop() {
        System.out.println("rrw Rw.");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity>=0 && capacity <= maxCapacity)
            this.capacity = capacity;
    }

    public void tank(int fuel){
        if(fuel < 0) return;
        if(fuel > maxCapacity)
            this.setCapacity(this.maxCapacity);
        else
            this.setCapacity(this.getCapacity()+fuel);
    }

    @Override
    public void sound() {
        System.out.println("Wr Wr Wr");
    }
}
