package com.bourbon.designpattern.created.single;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class SingleObjectThird {

    private static SingleObjectThird instance = new SingleObjectThird();

    private SingleObjectThird() {
    }

    public static SingleObjectThird getInstance() {
        return instance;
    }
}