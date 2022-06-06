package com.company.stuff.engines;

import com.company.stuff.Thing;

//dziedziczenie klasy i implementacja interfejsu
public class ElectricEngine extends Thing implements ActualEngine{
    public ElectricEngine(){}
    //statyczny polimorfizm
    public ElectricEngine(int price) {
        super(price);
    }

    @Override //dynamiczny polimorfizm
    public void start() {
        System.out.println("Bz bzzzzzz...");
    }

    @Override //dynamiczny polimorfizm
    public void stop() {
        System.out.println("zzzb Zb.");
    }

    @Override //dynamiczny polimorfizm
    public void sound() {
        System.out.println("Bz Bz Bz");
    }
}
