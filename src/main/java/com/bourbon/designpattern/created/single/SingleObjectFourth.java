package com.bourbon.designpattern.created.single;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class SingleObjectFourth {

    private static volatile SingleObjectFourth instance;

    private SingleObjectFourth() {
    }

    public static SingleObjectFourth getInstance() {
        if (instance == null) {
            synchronized (SingleObjectFourth.class) {
                if (instance == null) {
                    instance = new SingleObjectFourth();
                }
            }
        }
        return instance;
    }
}
