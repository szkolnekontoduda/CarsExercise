package com.company.things;

import com.company.stuff.Thing;

//dziedziczenie klasy
public class Cat extends Thing {
    public Cat(){}
    //statyczny polimorfizm
    public Cat(int price) {
        super(price);
    }
}
