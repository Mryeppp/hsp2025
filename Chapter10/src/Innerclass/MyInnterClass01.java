package Innerclass;

//java所有五大特性 1.继承 2.封装 3.多态 4.抽象 5.接口

//类的五大成员：1.成员变量 2.成员方法 3.构造方法 4.代码块 5.内部类

//内部类的作用：1.可以方便的访问外部类的私有成员 2.内部类可以被私有修饰 3.内部类可以被继承 4.内部类可以访问外部类的静态成员

//内部类的分类：1.成员内部类 2.局部内部类 3.匿名内部类 4.静态内部类
/**
 * 内部类的分类
 * 定义在外部类局部位置上：局部内部类 匿名内部类
 * 定义在外部类成员位置上：成员外部类 静态外部类
 */
class Outer01 {
    private int n1 = 1;
    protected int n2 = 2;
    public int n3 = 3;
    private static int n4 = 4;

    public static void ShowOuter01() {
        System.out.println("Outer01");
    }

    // 创建内部类实例的方法

    public Inner01 createInner01() {
        return new Inner01();
    }

    public Inner02 createInner02() {
        return new Inner02();
    }

    public int get_changen1() {

        return createInner02().changen1();
    }

    public void get_showInner02() {
        createInner02().ShowInner02();
    }

    public static class Inner01 {

        public void ShowInner01() {

            /** 1.可以方便的访问外部类的私有成员 */
            // 静态内部类中不能有静态成员变量，除非它们是常量
            // private static int n4 = 5 错误

            // static 只能访问 static
            // 修改其他non-static 变量是错误的
            n4 = 5;
            System.out.println("Inner01");
            System.out.println(n4);
        }
    }

    private class Inner02 {
        public int changen1() {
            return n1 = 7;
        }

        public void ShowInner02() {
            System.out.println("Inner02");
            System.out.println(n1);
        }
    }

}

class OuterOther extends Outer01 {

}

public class MyInnterClass01 {
    public static void main(String[] args) {
        Outer01 o = new Outer01();
        o.createInner01().ShowInner01();
        System.out.println("---");
        // o.createInner02().ShowInner02(); //错误 private不能直接访问
        System.out.println(o.get_changen1());
        System.out.println("---");
        o.get_showInner02();

    }
}
