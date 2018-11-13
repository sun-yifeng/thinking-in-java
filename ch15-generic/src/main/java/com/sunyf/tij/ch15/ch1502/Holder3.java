package com.sunyf.tij.ch15.ch1502;

/**
 * @program: thinking-in-java
 * @description: 车主3
 * @author: sunyf
 * @create: 2018-11-13 07:36
 **/
public class Holder3<T> {

    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        //创建泛型类的实例是，必须指明类型
        Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
        Automobile a = h3.get();
    }

}
