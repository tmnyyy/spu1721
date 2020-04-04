package com.itstep.Pattern;

import com.itstep.Pattern.AbstractBottle.AbstractBottle;
import com.itstep.Pattern.AbstractFactory.AbstractFactory;
import com.itstep.Pattern.AbstractWater.AbstractWater;

public class Client {

    private AbstractBottle bottle;
    private AbstractWater water;

    public Client(AbstractFactory factory) {
        // абстрагирование процесса инстанцирования
        this.bottle = factory.createBottle();
        this.water = factory.createWater();
    }

    public void run() {
        // абстрагирование вариантов использования
        bottle.interact(water);
    }
}
