package Innerclass;

class Outer {
    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }

    public void m1() {
        System.out.println("m1");
    }

    {
        System.out.println("m1 block");
    }

    class Inner01 {
        public void ShowInner01() {
            System.out.println("show Inner01");
        }

    }
    /*
     * 成员内部类 实例化的三个方法
     * 1.在外部类定义一个get_instance方法
     * 2.new outerclass().new innerclass();
     * 3.先实例化外部类 外部类的实例.new innerclass
     */
    // --------------------------------------------------------------------------------------

    //
    // 一定不要进行这样的操作，即：成员内部类不能在外部类中不加任何封装的进行 实例化
    // 为什么?

    // 当你在 Outer 类中进行内部类的实例化时，可能会出现一些隐式的调用链导致无限循环。
    // 例如，在 Outer 类中使用 Inner01 inner01_2 = new Outer(100).new Inner01();
    // 这样的语句进行内部类的实例化，这会调用 Outer 的构造函数 Outer(int n1)。
    // 如果Outer的构造函数中存在一些额外的逻辑或者初始化操作，可能会再次触发内部类的实例化，或者触发其他操作最终又回到Outer的构造函数，从而形成一个循环调用。
    // 此外，在 main 函数中多次使用 new Outer(100) 也会导致 Outer
    // 的构造函数被频繁调用，如果构造函数中的逻辑没有处理好，可能会造成无限循环。

    // 实现：

    // 1.在外部类定义一个方法
    public Inner01 get_Inner01() {
        System.out.println("get_Inner01 被调用");
        return new Inner01();

    }

    // // 在外部类进行实例化
    // // 2.new outerclass().new innerclass();
    // Inner01 inner01_2 = new Outer(10).new Inner01();
    // // 同 Inner01 inner01_2 = new Inner01();

    // // 3.先实例化外部类 外部类的实例.new innerclass
    // Outer o_in = new Outer(10);
    // Inner01 inner01_3 = o_in.new Inner01();

}

public class MemberInnerClass01 { //
    public static void main(String[] args) {

        // 在外部其他类进行实例化
        // 2.new outerclass().new innerclass();
        Outer.Inner01 inner01_4 = new Outer(10).new Inner01();

        // 3.先实例化外部类 外部类的实例.new innerclass
        Outer O_out = new Outer(10);
        Outer.Inner01 inner01_5 = O_out.new Inner01();

        // 调用：
        O_out.get_Inner01();
        // O_out.inner01_2.ShowInner01();
        // O_out.inner01_3.ShowInner01();

        inner01_4.ShowInner01();
        inner01_5.ShowInner01();
    }
}
