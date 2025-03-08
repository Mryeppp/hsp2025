package Innerclass;

class Outer02 {
    private int n1 = 1;

    private void m2() {
        System.out.println("Outer02.m2()");
    }

    public void m1() {
        /**
         * 1.局部内部类定义在外部类的局部，通常是方法中 所以局部内部类 又叫 方法内部类
         * 2.局部内部类类似于一个局部变量 不能用修饰符限制 并且方法内不能定义静态成员(不能使用static关键字)
         * 但是可以加final 让其不可以被继承
         * 3.定义域：仅仅定义在 它的方法和代码块中
         * 4.局部内部类可以直接访问 外部类的所有成员(包括私有成员) 如n1 、 m1()
         * 5.怎么调用局部内部类的方法 ： 外部类的方法中可以创建局部内部类对象实例 然后调用局部内部类方法即可
         * 6.外部其他类不能访问 局部内部类
         * 7.局部内部类和外部类的成员重名的时候 访问遵循就近原则，
         * 要是想访问外部类的方法 使用 外部类.this.类名
         */

        class Inner02 {
            public void f1() {
                Outer02.this.m2();
                // 访问的是外部类m2()。由于外部类m2()不是static的，所以不能Outer02.m2()
                // Outer02.this本质是外部类对象 即：那个对象调用了m1().谁就是Outer02.this

                m2();
                // 访问的是内部类
                System.out.println("n1 = " + n1);
            }

            public void m2() {
                System.out.println(" Inner02.m2()");
            }
        }

        Inner02 inner02 = new Inner02();
        inner02.f1();
        inner02.m2();

        // class Inner03 extends Inner02 {
        // // Inner02 不加final则可以让其他局部内部类继承
        // }

        // { //代码块里面的内部类
        // class Inner03{}

        // }

    }

    public void get_m2() {
        m2();
    }

}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("---");
        outer02.get_m2();
        System.out.println("---");

    }
}