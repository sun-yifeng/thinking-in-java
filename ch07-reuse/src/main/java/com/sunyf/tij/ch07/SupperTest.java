package com.sunyf.tij.ch07;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: thinking-in-java
 * @description: super和this测试
 * @author: sunyf
 * @create: 2018-12-04 17:25
 **/
public class SupperTest {

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
            case 4:
                result = result + i * 3;

        }
        return result;
    }

    public static void main(String[] args) {
        // ChildClass c = new ChildClass();
        System.out.println(getValue(2));

    }
}
