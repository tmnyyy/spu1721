package com.itstep;

public class Car {

    private int index = 0;

    public void move() {
        System.out.println("Car.move");
    }

    public void show() {
        System.out.println(index);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
