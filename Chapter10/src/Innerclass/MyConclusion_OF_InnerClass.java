package Innerclass;

// 方法内部类 成员内部类 匿名内部类
// 1.方法内部类
/**
 * 又叫局部内部类 定义在外部类的局部(如方法)中
 * 作用域仅在外部类 不可以加限定修饰符 但是可以加final 让其不可以被继承
 * 可以随意访问外部类的成员
 * 在方法中创建内部类对象实例即可访问内部类方法
 */
/**
 * 外部类方法和内部类成员重名时 访问时存在就近原则
 * 如果在内部类想访问外部类的重名成员，需要使用 外部类.this.方法名 访问
 */
class A {
    private int num = 1;

    public void shownum() {
        System.out.println("外部类访问num" + num);
    }

    public void method() {
        class B {
            public void shownum() {
                System.out.println("内部类访问num" + num);
                // System.out.println("外部类访问num" + A.this.num);
            }
        }
        B b = new B();
        b.shownum();
    }

}
/*********************************************************************************************************** */

// 成员内部类
/**
 * 成员部类可以随意访问外部类成员
 * 作用域仅在外部类中 外部其他类不能直接访问成员内部类
 * 出现内外重名方法时访问时同其他内部类的规则，不再多说，见第13行
 * 
 * 实例化：
 * 1.外部类定义一个方法实例化成员内部类
 * 2.外.内 类名 = new 外().new 内()
 * 3.先实例化外部类 在实例化内部类
 * 外 外类名 = new 外();
 * 外.内 内类名 = 外类名.new 内();
 */

class C {
    int Cnum = 1;

    class D {
        int Dnum = 2;

        public void show_Dnum() {
            System.out.println("Dnum = " + Dnum);
        }

    }

    public D GetInstance() {
        System.out.println("外部类定义一个方法实例化成员内部类");
        return new D();
    }

}

/************************************************************ */

/**
 * 匿名内部类 ： 定义在外部类的局部中，如方法中。
 * 作用域：类似于局部变量（同 局部内部类）
 * 分为 基于接口的匿名内部类 还有 基于类的匿名内部类
 * 匿名内部类还是一个对象！！！
 */

class E {
    public void method_base_interface() {
        // 底层 class E$1 implements G
        G g = new G() {
            @Override
            public void hi() {
                System.out.println("method_base_interface hi");
            }
        }; // 冒号
        g.hi();
    }

    public void method_base_class02() {

        // 底层 class E$2 extends F
        new F() {
            @Override
            public void hi() {
                System.out.println("method_base_class02() hi");
            }

            @Override
            public void ok(String name) {
                super.ok(name);
            }

        }.ok("jack");/**
                      * ！！！！
                      * 匿名内部类还是一个对象！！！！
                      */
    }

    public void method_base_class01() {
        F f = new F() {
            private int a = 1;

            @Override
            public void hi() {
                System.out.println("method_base_class01() hi");
            }
        };
        f.hi(); // method_base_class02() hi
    }
}

class F {
    public void hi() {
        System.out.println("f hi");
    }

    public void ok(String name) {
        System.out.println("ok " + name);
    }
}

interface G {
    public void hi();
}

public class MyConclusion_OF_InnerClass {
    public static void main(String[] args) {
        // A a = new A();
        // a.method(); // 内部类1
        /************************* */
        C c = new C();
        C.D d01 = c.GetInstance();// getinstance 被调用
        C.D d02 = new C().new D();
        d02.show_Dnum(); //
        d01.show_Dnum();//
        /************************* */
        // E e = new E();
        // e.method_base_class01();
        // e.method_base_interface();
        // e.method_base_class02();

    }
}
