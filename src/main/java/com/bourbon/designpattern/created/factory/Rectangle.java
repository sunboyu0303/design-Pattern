package com.bourbon.designpattern.created.factory;

/**
 * @author sunboyu
 * @date 2018/3/16
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}