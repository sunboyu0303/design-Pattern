package com.bourbon.designpattern.created.abstractfactory;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class ColorFactory implements Factory {

    @Override
    public Color getColor(Class<? extends Color> clazz) {
        Color color;
        try {
            color = (Color) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            color = null;
        }
        return color;
    }
}