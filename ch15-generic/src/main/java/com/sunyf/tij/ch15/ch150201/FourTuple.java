package com.sunyf.tij.ch15.ch150201;

/**
 * @program: thinking-in-java
 * @description: 三元元组
 * @author: sunyf
 * @create: 2018-11-13 07:51
 **/
public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {

    public D fourth;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.fourth = d;
    }

    public String toString() {
        return "(" + first + "," + second + ","
                   + third + "," + "fourth" +")";
    }

}
