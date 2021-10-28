package com.app.core;

public enum FoodMenu {
    NOODLES(60), RICE(100), SOUP(120), SNACKS(50);
    private int price;
    //constr : user defined ctor : implicitly private
     FoodMenu(int price) {
        //super(name,ordinal)
        this.price=price;
    }
     //methods : getter / setter
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString()
    {
        return name()+"@"+price;
    }
}