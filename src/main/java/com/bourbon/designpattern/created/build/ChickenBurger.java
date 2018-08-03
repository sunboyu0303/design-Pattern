package com.bourbon.designpattern.created.build;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 50.5;
    }
}
