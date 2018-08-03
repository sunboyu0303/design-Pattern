package com.bourbon.designpattern.created.build;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 30.0;
    }
}
