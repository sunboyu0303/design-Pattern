package com.bourbon.designpattern.created.single;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class SingleObjectFifth {

    private static class SingleObjectHolder {
        private static final SingleObjectFifth INSTANCE = new SingleObjectFifth();

        private SingleObjectHolder() {
        }
    }

    private SingleObjectFifth() {
    }

    public static SingleObjectFifth getInstance() {
        return SingleObjectHolder.INSTANCE;
    }
}