package Block;

// 代码块的调用顺序问题 
/**
 * 1.静态代码块和静态属性初始化这两者调用优先级相同，如果二者同时出现，按顺序调用
 * 2.普通代码块和普通属性初始化这两者调用优先级相同，如果二者同时出现，按顺序调用
 * 3.调用构造方法
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        A a = new A();

        /**
         * (1) A 静态代码块01
         * (2) getN1()被调用
         * 优先级一样 顺序提前的先被调用
         * (3) A 普通代码块01
         * (4) A的无参数构造方法被调用
         */
        A a2 = new A(0);

        /**
         * A 静态代码块01
         * getN1()被调用
         * A 普通代码块01
         * A的带参数构造方法被调用
         */
        B b = new B();
        /**
         * (1) getN2()被调用
         * (2) B 静态代码块01
         * 优先级一样 顺序提前的先被调用
         * (3) B的构造方法被调用
         */
    }
}

class A {

    public A(int val) {
        System.out.println("A的带参数构造方法被调用");
        this.n0 = val;
        this.n1 = val;
    }

    public A() {
        System.out.println("A的无参数构造方法被调用");
    }

    static {
        System.out.println("A 静态代码块01");
    }
    {
        System.out.println("A 普通代码块01");
    }
    private int n0;

    private static int n1 = getN1();
    // 静态代码块的初始化

    public static int getN1() {
        System.out.println("getN1()被调用");
        return 100;

    }

}

class B {

    public B() {
        System.out.println("B的构造方法被调用");
    }

    private int n2 = getN2();

    {
        System.out.println("B 静态代码块01");
    }

    public int getN2() {
        System.out.println("getN2()被调用");
        return 200;

    }

}