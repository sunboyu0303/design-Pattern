package com.bourbon.designpattern.created.factory;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class Test {

    public static void main(String[] args) {

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Rectangle rect = ShapeFactory.getShape(Rectangle.class);
        rect.draw();

        Circle circ = ShapeFactory.getShape(Circle.class);
        circ.draw();
    }
}