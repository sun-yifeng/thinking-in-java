package com.sunyf.tij.ch08.demo1;

/**
 * @program: thinking-in-java
 * @description: CSDN 理解java的三大特性之多态
 * @author: Mr.Sun
 * @create: 2018-10-24 11:03
 **/
public class B extends A{ // B继承A

    public String show(A obj){ return ("B and A"); }

    public String show(B obj){
        return ("B and B");
    }

}
