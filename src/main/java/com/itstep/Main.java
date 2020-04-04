package com.itstep;

import com.itstep.Pattern.AbstractFactory.PepsiFactory;
import com.itstep.Pattern.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        Client client = new Client(new PepsiFactory());
        client.run();
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
//        Car car = ctx.getBean("car", Car.class);
//        car.setIndex(2);
//        car.show();
//        Car car1 = ctx.getBean("car", Car.class);
//        car.move();
//        car1.show();
    }
}
