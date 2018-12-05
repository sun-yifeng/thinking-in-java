package com.sunyf.tij.ch15.ch150201;

/**
 * @program: thinking-in-java
 * @description: 元组泛型
 * @author: sunyf
 * @create: 2018-11-13 ch07:44
 **/
public class TwoTuple<A, B> {

    // final声明保证不能修改
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
