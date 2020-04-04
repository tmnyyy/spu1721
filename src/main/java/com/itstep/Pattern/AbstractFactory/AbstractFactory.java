package com.itstep.Pattern.AbstractFactory;

import com.itstep.Pattern.AbstractBottle.AbstractBottle;
import com.itstep.Pattern.AbstractWater.AbstractWater;

public abstract class AbstractFactory {
    public abstract AbstractBottle createBottle();
    public abstract AbstractWater createWater();
}
