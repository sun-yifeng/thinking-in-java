package com.sunyf.tij.ch21.ch2124;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @program: thinking-in-java
 * @description: 从任务中返回值
 * @author: sunyf
 * @create: 2018-11-13 06:39
 **/
public class CallableDemo {

    public static void main(String[] args) {

        ExecutorService exec = Executors.newCachedThreadPool();

        ArrayList<Future<String>> results = new ArrayList<Future<String>>();

        //新建10个线程
        for (int i = 0; i < 10; i++)
            results.add(exec.submit(new TaskWithResult(i)));

        for(Future<String> fs : results)
            try {
                // get() blocks(阻塞) until completion:
                System.out.println(fs.get());
            } catch(InterruptedException e) {
                System.out.println(e);
                return;
            } catch(ExecutionException e) {
                System.out.println(e);
            } finally {
                exec.shutdown();
            }
    }
}

/*Output:
result of TaskWithResult 0
result of TaskWithResult 1
result of TaskWithResult 2
result of TaskWithResult 3
result of TaskWithResult 4
result of TaskWithResult 5
result of TaskWithResult 6
result of TaskWithResult 7
result of TaskWithResult 8
result of TaskWithResult 9
*/
