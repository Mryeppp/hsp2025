package Static;

public class VisitStatic {

    public static void main(String[] args) {

        DetailStaticMethods.B();
        // 静态方法可以不创建对象直接调用
        // 例如标准库里的方法皆为静态方法可以直接调用，如Math库
        System.out.println("9的平方根是" + Math.sqrt(9));
        // 但是普通方法必须创建实例才能调用
        DetailStaticMethods detailStaticMethods = new DetailStaticMethods();
        detailStaticMethods.A();
        DetailStaticMethods.C();
    }
}

class DetailStaticMethods {
    private int a = 1;
    private static int b = 2;

    public void A() {
        // 名为普通方法
        System.out.println("A");
        System.out.println(this.a);
        // 普通方法允许使用和对象有关的关键字，如super，this

        System.out.println(b);
        System.out.println(a);// 普通方法可以访问普通成员和静态成员
    }

    public static void B() {
        // 名为静态方法/类方法
        // 不允许使用和对象有关的关键字，如super，this
        System.out.println("B");
        System.out.println(b); // 静态方法只能访问静态成员

    }

    public static void C() {
        System.out.println("C");
        B();// 静态方法只能访问静态成员

    }
}
