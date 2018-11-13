package com.sunyf.tij.ch15.ch150202;

/**
 * @program: thinking-in-java
 * @description: 带泛型的堆栈
 * @author: sunyf
 * @create: 2018-11-13 08:23
 **/
public class LinkedStack<T> {

    //定义节点类（内部类）
    private static class Node<U> {

        U item; //当前节点
        Node<U> next; //下一个节点

        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        //哨兵方法
        boolean end() {
            return item == null && next == null;
        }
    }

    //新建节点实例
    private Node<T> top = new Node<T>();

    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop () {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }

}
