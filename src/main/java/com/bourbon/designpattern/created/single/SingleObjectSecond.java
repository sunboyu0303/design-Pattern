package com.bourbon.designpattern.created.single;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class SingleObjectSecond {

    private static SingleObjectSecond instance;

    private SingleObjectSecond() {
    }

    public static synchronized SingleObjectSecond getInstance() {
        if (instance == null) {
            instance = new SingleObjectSecond();
        }
        return instance;
    }
}