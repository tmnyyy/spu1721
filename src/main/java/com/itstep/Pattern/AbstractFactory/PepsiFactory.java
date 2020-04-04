package com.itstep.Pattern.AbstractFactory;

import com.itstep.Pattern.AbstractBottle.AbstractBottle;
import com.itstep.Pattern.AbstractBottle.PepsiBottle;
import com.itstep.Pattern.AbstractWater.AbstractWater;
import com.itstep.Pattern.AbstractWater.PepsiWater;

public class PepsiFactory extends AbstractFactory {

    public AbstractBottle createBottle() {
        return new PepsiBottle();
    }

    public AbstractWater createWater() {
        return new PepsiWater();
    }
}
