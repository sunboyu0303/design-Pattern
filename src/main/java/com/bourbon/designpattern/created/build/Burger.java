package com.bourbon.designpattern.created.build;

/**
 * Created by sunboyu on 2018/3/16.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}