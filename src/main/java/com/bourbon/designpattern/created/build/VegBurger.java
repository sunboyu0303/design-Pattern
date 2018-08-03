package com.bourbon.designpattern.created.build;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 25.0;
    }
}
