package com.bourbon.designpattern.created.abstractfactory;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
