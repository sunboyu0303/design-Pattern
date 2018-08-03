package com.bourbon.designpattern.created.single;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class SingleObjectOne {

    private static SingleObjectOne instance;

    private SingleObjectOne() {
    }

    public static SingleObjectOne getInstance() {
        if (instance == null) {
            instance = new SingleObjectOne();
        }
        return instance;
    }
}