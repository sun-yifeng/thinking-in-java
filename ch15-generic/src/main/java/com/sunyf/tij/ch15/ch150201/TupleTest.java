package com.sunyf.tij.ch15.ch150201;

/**
 * @program: thinking-in-java
 * @description: 元组测试
 * @author: sunyf
 * @create: 2018-11-13 08:03
 **/
public class TupleTest {

    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("hi", 42);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(),
        "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k(){
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(),
         "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> two = f();
        //
        System.out.println(two);
        //
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());

    }

}
