package com.bourbon.designpattern.created.abstractfactory;

/**
 * @author sunboyu
 * @date 2018/3/16
 */
public class Rectangle implements Shape {
    @Override
    public void drow() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}