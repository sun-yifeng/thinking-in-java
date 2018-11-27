package com.sunyf.tij.ch21.ch210702;

import java.util.Random;

/**
 * @program: thinking-in-java
 * @description: 随机数
 * @author: sunyf
 * @create: 2018-11-27 13:27
 **/
public class RandomDemo {

    public static void main(String[] args) {
        Random rand = new Random(47);
        System.out.println(rand.nextInt(100));
    }
}
