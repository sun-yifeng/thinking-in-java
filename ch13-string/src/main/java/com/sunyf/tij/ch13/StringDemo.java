package com.sunyf.tij.ch13;

/**
 * @program: thinking-in-java
 * @description: String的不可变性
 * 1、String的对象是不可变的，每个修改String变量的方法（String当参数使用），实际上都是重新创建了一个对象，而原来的对象未变；
 * 2、下面的例子中：s1传给s2时，s2会重新创建引用，赋值后，s1未变; s3传给s4时，s2会重新创建引用，赋值后，s3改变变;
 * 3、不可变的好处：为了安全合理，对一个方法而言，参数是提供信息的，不是为了改变参数；这跟传其他类型引用很大不同；
 * @author: Mr.Sun
 * @create: 2018-03-26 19:58
 **/
public class StringDemo {

    // 两个String的对象相加
    public static java.lang.String appendStr(java.lang.String s2) {
        s2 += "bbb";
        System.out.println("打印第1行,s1:" + s2);
        return s2;
    }

    // 两个StringBuilder对象相加
    public static StringBuilder appendSb(StringBuilder s4) {
        return s4.append("bbb");
    }

    public static void main(java.lang.String[] args) {
        // 定义String对象"aaa"
        java.lang.String s1 = new java.lang.String("aaa");

        // tmp1从未使用，此行只是为了调用appendStr()方法
        java.lang.String tmp1 = StringDemo.appendStr(s1);

        // 打印出的结果，s2还是"aaa"
        System.out.println("打印第2行,s2:" + s1.toString());

        // 定义StringBuilder（非线程安全）"aaa"
        StringBuilder s3 = new StringBuilder("aaa");
        // 只是为了调用appendSb()方法，不需要使用tmp2
        StringBuilder tmp2 = StringDemo.appendSb(s3);

        // 打印出的结果，s3由"aaa"变成了"aaabbb"
        System.out.println("打印第3行,s3:" + s3.toString());
    }
}