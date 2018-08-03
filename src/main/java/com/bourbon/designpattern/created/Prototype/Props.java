package com.bourbon.designpattern.created.Prototype;

import java.io.Serializable;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class Props implements Serializable {

    private String name;
    private int age;

    public Props(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
