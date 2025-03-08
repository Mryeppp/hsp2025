package Block;

public class NormalCodeBlock {
    // 如果只是调用类的静态方法，普通代码块不加载
    public static void main(String[] args) {
        Dd.print();
        System.out.println(Dd.a);
    }
}

class Dd {
    {
        System.out.println("Dd的普通代码块,只是调用类的静态方法，普通代码块不加载");
    }
    static int a = 1;

    static void print() {
        System.out.println("Dd的静态方法");
    }

}
