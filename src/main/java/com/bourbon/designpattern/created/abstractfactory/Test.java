package com.bourbon.designpattern.created.abstractfactory;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class Test {

    public static void main(String[] args) {
        Factory shapeFactory = FactoryProducer.getFactory(ShapeFactory.class);
        Shape shape = shapeFactory.getShape(Rectangle.class);
        shape.drow();
        shape = shapeFactory.getShape(Circle.class);
        shape.drow();

        System.out.println();

        Factory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
        Color color = colorFactory.getColor(Red.class);
        color.fill();
        color = colorFactory.getColor(Blue.class);
        color.fill();
    }
}