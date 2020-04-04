package com.itstep.Pattern.AbstractBottle;

import com.itstep.Pattern.AbstractBottle.AbstractBottle;
import com.itstep.Pattern.AbstractWater.AbstractWater;

public class PepsiBottle extends AbstractBottle {
    public void interact(AbstractWater water) {
        System.out.println(this + " interact with " + water);
    }

    @Override
    public String toString() {
        return "PepsiBottle";
    }
}
