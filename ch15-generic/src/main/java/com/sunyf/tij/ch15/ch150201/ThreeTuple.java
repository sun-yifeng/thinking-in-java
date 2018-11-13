package com.sunyf.tij.ch15.ch150201;

/**
 * @program: thinking-in-java
 * @description: 三元元组
 * @author: sunyf
 * @create: 2018-11-13 07:51
 **/
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

    public C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.third = c;
    }

    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }

}
