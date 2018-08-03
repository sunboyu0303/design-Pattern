package com.bourbon.designpattern.created.Prototype;

/**
 * Created by sunboyu on 2018/3/16.
 */
public class Test {

    public static void main(String[] args) throws Exception {

        PrototypeObject prototypeObject = new PrototypeObject();
        prototypeObject.setKey(1);
        Props props = new Props("张三", 20);
        prototypeObject.setProps(props);

        System.out.println("原始对象：" + prototypeObject.getProps());
        System.out.println("原始对象 name 属性：" + prototypeObject.getProps().getName());

        PrototypeObject clonePrototypeObject = (PrototypeObject) prototypeObject.clone();
        System.out.println("浅复制对象：" + clonePrototypeObject.getProps());
        System.out.println("浅复制对象 name 属性：" + clonePrototypeObject.getProps().getName());

        PrototypeObject deepPrototypeObject = (PrototypeObject) prototypeObject.deepClone();
        System.out.println("深复制对象：" + deepPrototypeObject.getProps());
        System.out.println("深复制对象 name 属性：" + deepPrototypeObject.getProps().getName());

        System.out.println("对复制对象进行修改：");
        clonePrototypeObject.getProps().setName("李四");
        System.out.println("原始对象 name 属性：" + prototypeObject.getProps().getName());
        System.out.println("浅复制对象 name 属性：" + clonePrototypeObject.getProps().getName());
        System.out.println("深复制对象 name 属性：" + deepPrototypeObject.getProps().getName());
    }
}
