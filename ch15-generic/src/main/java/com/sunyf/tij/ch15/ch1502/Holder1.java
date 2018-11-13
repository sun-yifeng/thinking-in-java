package com.sunyf.tij.ch15.ch1502;

/**
 * @program: thinking-in-java
 * @description: 车主1
 * @author: sunyf
 * @create: 2018-11-13 07:25
 **/
public class Holder1 {

    //汽车
    private Automobile a;

    //车主
    public Holder1(Automobile a) {
        this.a = a;
    }

    //取车
    Automobile get() {
        return a;
    }
}
