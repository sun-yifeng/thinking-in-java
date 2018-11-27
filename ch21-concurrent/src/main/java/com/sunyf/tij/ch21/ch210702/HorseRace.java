package com.sunyf.tij.ch21.ch210702;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @program: thinking-in-java
 * @description: 屏障
 * @author: sunyf
 * @create: 2018-11-27 10:44
 **/
public class HorseRace {
    static final int FINAL_LINE = 75; // 跑道长度（终点线）
    private List<Horse> horses = new ArrayList<Horse>();
    private ExecutorService exec = Executors.newCachedThreadPool();
    private CyclicBarrier barrier;

    public HorseRace(int nHourses, final int pause) {
        barrier = new CyclicBarrier(nHourses, new Runnable() {
            @Override
            public void run() {
                StringBuilder s = new StringBuilder();
                for (int i = 0; i < FINAL_LINE; i++) {
                    s.append("=");
                }
                System.out.println(s);
                for (Horse horse : horses) {
                    System.out.println(horse.tracks());
                }
                for (Horse horse : horses) {
                    if (horse.getStrides() >= FINAL_LINE) {
                        System.out.println(horse + "won");
                        exec.shutdownNow();
                        return;
                    }
                }
                try {
                    TimeUnit.MICROSECONDS.sleep(pause);
                } catch (InterruptedException e) {
                    System.out.println("barrier-action sleep interrupted!");
                    e.printStackTrace();
                }
            }
        });
        for (int i = 0; i < nHourses; i++) {
            Horse horse = new Horse(barrier);
            horses.add(horse);
            exec.execute(horse);
        }
    }

    public static void main(String[] args) {
        int nHorses = 7; // 7匹马（7个屏障）
        int pause = 200; // 停顿次数
        // 可选参数
        if (args.length > 0) {
            int n = new Integer(args[0]);
            nHorses = n > 0 ? n : nHorses;
        }
        // 可选参数
        if (args.length > 1) {
            int p = new Integer(args[1]);
            pause = p > -1 ? p : pause;
        }
        new HorseRace(nHorses, pause);
    }
}

