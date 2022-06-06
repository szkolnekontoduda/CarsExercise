package com.company.stuff.engines;

import com.company.stuff.Thing;

//dziedziczenie klasy i implementacja interfejsu
public class CombustionEngine extends Thing implements ActualEngine{
    private int maxCapacity;
    private int capacity;

    public CombustionEngine(){}
    //statyczny polimorfizm
    public CombustionEngine(int maxCapacity, int price){
        super(price);

        this.maxCapacity = maxCapacity;
    }

    @Override //dynamiczny polimorfizm
    public void start() {
        System.out.println("Wr wrrrrrr...");
    }

    @Override //dynamiczny polimorfizm
    public void stop() {
        System.out.println("rrw Rw.");
    }

    @Override //dynamiczny polimorfizm
    public void sound() {
        System.out.println("Wr Wr Wr");
    }

    //enkapsulacja
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity>=0 && capacity <= maxCapacity)
            this.capacity = capacity;
    }

    public void tank(int fuel){
        if(fuel < 0)           return;
        if(fuel > maxCapacity) this.setCapacity(this.maxCapacity);
        else                   this.setCapacity(this.getCapacity()+fuel);
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
