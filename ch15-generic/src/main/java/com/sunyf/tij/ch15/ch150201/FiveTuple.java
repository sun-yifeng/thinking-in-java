package com.sunyf.tij.ch15.ch150201;

/**
 * @program: thinking-in-java
 * @description: 三元元组
 * @author: sunyf
 * @create: 2018-11-13 ch07:51
 **/
public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C ,D> {

    public E fifth;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.fifth = e;
    }

    public String toString() {
        return "(" + first + "," + second + ","
                + third + "," + "fourth" + "," + "fifth" +")";    }

}
