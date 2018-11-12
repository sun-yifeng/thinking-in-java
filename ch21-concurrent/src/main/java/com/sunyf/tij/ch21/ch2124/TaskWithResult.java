package com.sunyf.tij.ch21.ch2124;

import java.util.concurrent.Callable;

/**
 * @program: thinking-in-java
 * @description:
 *
 * 从任务中返回值，Callable接口和Future接口的配合使用
 *
 * 1、如果要线程返回值，实现Callable<>接口, 泛型参数表示call()方法返回的类型；注意么有run()方法；
 * 2、必须用ExecutorService.submit()方法调用任务线程;
 * 3、Future接口，提供了线程是否完成（isDone）中断，获取结果的方法。
 *
 * @author: sunyf
 * @create: 2018-11-13 06:38
 **/
public class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    // 必须有要call方法
    public String call() {
        return "result of TaskWithResult " + id;
    }
}
