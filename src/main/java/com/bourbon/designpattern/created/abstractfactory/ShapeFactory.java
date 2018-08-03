package com.bourbon.designpattern.created.abstractfactory;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class ShapeFactory implements Factory {

    @Override
    public Shape getShape(Class<? extends Shape> clazz) {
        Shape shape;
        try {
            shape = (Shape) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            shape = null;
        }
        return shape;
    }
}