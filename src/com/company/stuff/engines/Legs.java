package com.company.stuff.engines;

import com.company.stuff.Thing;

public class Legs extends Thing implements Engine{
    public Legs(int price) {
        super(price);
    }

    @Override
    public void sound() {
        System.out.println("toop toop");
    }
}
