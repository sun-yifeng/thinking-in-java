package com.sunyf.tij.ch08.demo1;

/**
 * @program: thinking-in-java
 * @description: CSDN 理解java的三大特性之多态
 * @author: Mr.Sun
 * @create: 2018-10-24 11:01
 **/
public class A {

    public String show(A obj) {
        return ("A and A");
    }

    public String show(D obj) {
        return ("A and D");
    }

}
