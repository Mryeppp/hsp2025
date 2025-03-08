package Innerclass;

import Innerclass.StaticInnerClass.StaticInner;

public class StaticInnerClass {
    // 定义在外部类的成员位置，用static修饰
    public static void main(String[] args) {
        // 作用域: 和其他成员相同 作用于整个类
        StaticInner staticInner = new StaticInner();
        staticInner.say();

    }

    private int a = 1;
    static int b = 2;

    private static void cry() {
        System.out.println("cry");
    }

    static class StaticInner {
        // 可以访问外部类的所有 静态成员 但是不能访问非静态成员
        // 可以任意添加 访问修饰符
        void say() {
            // System.out.println(a);Cannot make a static reference to the non-static field
            System.out.println(b);
            cry();
        }

    }
}

// 外部其他类怎么访问静态内部类 (当然静态内部类不允许有private修饰)
// 第一种方式 静态内部类直接可以通过 外部类名.静态内部类访问
class OuterOther01 {
    // 第二种方式是写一个方法 返回静态内部类的对象实例
    // 用方法返回一个类的实例 在其他内部类也经常用到
    // 我发现 这个方法定义成静态的比较省事，会免除创建类的步骤 但是根据具体需求灵活变通
    static public StaticInner Get_static_StaticInner() {
        return new StaticInner();
    }

    public StaticInner GetStaticInner() {
        return new StaticInner();
    }

    public static void main(String[] args) {
        StaticInner s = new StaticInnerClass.StaticInner();
        s.say();

        Get_static_StaticInner().say(); // 定义成静态比较省事

        OuterOther01 outerOther01 = new OuterOther01();
        outerOther01.GetStaticInner().say();
    }
    // 静态内部类 内外重名的问题不再多说

}
