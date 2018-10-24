package com.sunyf.tij.ch08.demo1;

/**
 * @program: thinking-in-java
 * @description: CSCN 理解java的三大特性之多态
 *
 * 多态机制遵循的原则概括为：当超类对象引用变量引用子类对象时，
 * 被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
 * 但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法，
 * 但是它仍然要根据继承链中方法调用的优先级来确认方法，该优先级为：
 * this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
 *
 * 首先我们分析5，a2.show(c)，a2是A类型的引用变量，所以this就代表了A，a2.show(c),
 * 它在A类中找发现没有找到，于是到A的超类中找(super)，由于A没有超类（Object除外），
 * 所以跳到第三级，也就是this.show((super)O)，C的超类有B、A，所以(super)O为B、A，
 * this同样是A，这里在A中找到了show(A obj)，同时由于a2是B类的一个引用且B类重写了show(A obj)，
 * 因此最终会调用子类B类的show(A obj)方法，结果也就是B and A。
 *
 * @author: Mr.Sun
 * @create: 2018-10-24 11:04
 **/
public class Main {

    public static void main(String[] args) {

        A a1 = new A(); // a1普通类型
        A a2 = new B(); // a2父类类型的子类对象

        B b = new B();  // a普通类型
        C c = new C();  // b普通类型
        D d = new D();  // d普通类型

        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));

        System.out.println("-----------------");

        System.out.println("4--" + a2.show(b)); //并么有调用b.show()，调用a.show();
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));

        System.out.println("-----------------");

        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));

    }

}
