package com.bourbon.designpattern.created.factory;

/**
 * @author sunboyu
 * @date 2018/3/16
 */
public final class ShapeFactory {

    private ShapeFactory() {
    }

    public static Shape getShape(String shapeType) {
        Shape shape = null;
        if (shapeType != null) {
            switch (shapeType.toLowerCase()) {
                case "rectangle":
                    shape = new Rectangle();
                    break;
                case "circle":
                    shape = new Circle();
                    break;
                default:
            }
        }
        return shape;
    }

    public static <T> T getShape(Class<T> clazz) {
        T shape;
        try {
            shape = (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            shape = null;
        }
        return shape;
    }
}