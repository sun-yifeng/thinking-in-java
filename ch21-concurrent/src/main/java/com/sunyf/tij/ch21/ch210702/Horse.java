package com.sunyf.tij.ch21.ch210702;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @program: thinking-in-java
 * @description: 赛马
 * @author: sunyf
 * @create: 2018-11-27 13:18
 **/
public class Horse implements Runnable {

    private static int counter = 0;
    private final int id = counter++;
    private int strides = 0; // 步幅（步伐）
    private static Random rand = new Random(47); // 小于47的整数
    private static CyclicBarrier barrier; // 屏障

    public Horse(CyclicBarrier b) {
        barrier = b;
    }

    // 获取步伐
    int getStrides() {
        return strides;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    // 步伐：是随机的
                    strides += rand.nextInt(3); // 产生0、1、2
                }
                barrier.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return "Horse " + id + " ";
    }

    // 跑道（轨道）
    public String tracks() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < getStrides(); i++) {
            s.append("*");
        }
        s.append(id);
        return s.toString();
    }
}
