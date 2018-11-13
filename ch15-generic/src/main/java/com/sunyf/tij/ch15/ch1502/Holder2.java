package com.sunyf.tij.ch15.ch1502;

/**
 * @program: thinking-in-java
 * @description: 车主2
 * @author: sunyf
 * @create: 2018-11-13 07:27
 **/
public class Holder2 {

    private Object a;

    //Holder2可以存储任何类型的对象
    public Holder2(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public static void main(String[] args) {
        //汽车
        Holder2 h2 = new Holder2(new Automobile());
        Automobile a = (Automobile)h2.get();
        //字符
        h2.set("Not an Automobile");
        String s = (String)h2.get();
        //数字
        h2.set(1);
        Integer x = (Integer)h2.get();
    }
}
