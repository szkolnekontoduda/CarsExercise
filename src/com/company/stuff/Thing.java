package com.company.stuff;

public class Thing {
    //enkapsulacja
    private int price;

    public Thing(){}
    //statyczny polimorfizm
    public Thing(int price){}

    //gettery i settery
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price >= 0)
            this.price = price;
    }

    public void buy(String price){
        System.out.println("bought for "+price);
    }
    public void sell(String price){
        System.out.println("sold for "+price);
    }

    public void printPatentsClassName(){
        System.out.println(this.getClass().getSuperclass().getName());
    }

    public void printClassName(){
        System.out.println(this.getClass().getName());
    }
}
