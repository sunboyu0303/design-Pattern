package com.bourbon.designpattern.created.abstractfactory;

/**
 * @author sunboyu
 * @date 2018/3/16
 */
public final class FactoryProducer {

    private FactoryProducer() {
    }

    public static Factory getFactory(Class<? extends Factory> clazz) {
        Factory factory;
        try {
            factory = (Factory) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            factory = null;
        }
        return factory;
    }
}