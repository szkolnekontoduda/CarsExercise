package com.company.stuff.engines;

import com.company.stuff.Thing;

//dziedziczenie klasy
public class Legs extends Thing implements Engine{
    public Legs(int price) {
        super(price);
    }

    @Override //polimorfizm dynamiczny
    public void sound() {
        System.out.println("toop toop");
    }
}
