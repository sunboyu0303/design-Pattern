package com.bourbon.designpattern.created.abstractfactory;

/**
 * @author sunboyu
 * @date 2018/3/16
 */
public interface Factory {

    default Color getColor(Class<? extends Color> clazz) {
        return null;
    }

    default Shape getShape(Class<? extends Shape> clazz) {
        return null;
    }
}