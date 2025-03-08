package Innerclass;

/**
 * 匿名内部类
 * 定义在外部类的局部，通常是方法中
 * 1.本质是类
 * 2.内部类
 * 3.没有名字
 * 4.还是一个对象
 * 匿名内部类 是定义在外部类的局部位置,如方法中,并且没有类名
 * 匿名内部类分为 基于接口的 和 基于类的
 */

/**
 * 基于接口的 匿名内部类
 * 按照原始的方法 实现一个借口 需要创建一个对象
 * 但是问题在于有很多类只是用一次就不在使用
 * 所以出现了 基于匿名内部类的语法 用来简化开发
 * 1.tiger 编译类型 看等号左边类型 IA
 * 2.tiger 运行类型 匿名内部类
 */
// 底层代码：
/*
 * class Outer03$1 implements IA{
 * 
 * @Override
 * public void cry() {
 * System.out.println("tiger cry");
 * }
 * };
 */
// 3. jdk在底层创建类Outer03$1 立即创建了Outer3$1的实例，并且把地址传给tiger
// 4. 匿名内部类在底层只能使用一次 虽然tiger可以一直调用cry(),但是底层的匿名内部类只能使用一次。

class Outer03 {
    private int n1 = 1;

    public void method_base_Interface() {
        // 基于接口的匿名内部类
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("tiger cry");
            }
        }; // 冒号注意 这是匿名内部类无法省去的语法
        tiger.cry();
    };

    public void method_base_class() {
        // 基于类的匿名内部类 可以重写可以不重写
        // Father father = new Father("jack"); //这只是类的创建

        // 这是基于类的匿名内部类
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写类Father的test方法");
            }
        };
        System.out.println("father 运行类型 =  " + father.getClass());
        // father.test();

        /**
         * 1. father 编译类型 Father
         * 2. father 运行类型 匿名内部类 Outer03$2
         * 3.底层会创建匿名内部类
         */
        /*
         * 底层代码
         * class Outer03$2 extends Father{
         * 
         * @Override
         * public void test() {
         * System.out.println("匿名内部类重写类Father的test方法");
         * }
         * }
         */
        // 4.同时也直接返回匿名内部类Outer03$2的对象，返回给father
        // 5.注意("jack") 参数列表会传递给构造器

    };

    // 基于抽象类的匿名内部类 //必须重写而已
    public void method_base_abs_class() {
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("dog eat");
            }
        };
        dog.eat();
    }

}

interface IA {
    public void cry();
}

class Father { // 类
    public Father(String name) { // 构造器
        System.out.println("接收到name=" + name);
    }

    public void test() { // 方法
    }
}

abstract class Animal {
    abstract void eat();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.method_base_Interface();
        // tiger cry
        outer03.method_base_class();
        // 接收到name=jack
        // father 运行类型 = class Chapter10.Inerclass.Outer03$2
        // 匿名内部类重写类Father的test方法

        outer03.method_base_abs_class();
        // dog eat

    }
}
