package com.bourbon.designpattern.created.abstractfactory;

/**
 * @author sunboyu
 * @date 2018/3/16
 */
public class Circle implements Shape {
    @Override
    public void drow() {
        System.out.println("Inside Circle::draw() method.");
    }
}