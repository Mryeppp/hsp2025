package super_;

public class Super01 {
    /**
     * 1.super 访问父类的属性(private不行)
     * 2.super 访问父类的方法 (private不行)
     * 3.super 访问父类的构造方法 只能放在构造器的第一行，且只能有一个//调用父类构造器必须在子类构造器内部第一行使用super
     */
    public static void main(String[] args) {
        super_02 s = new super_02();
        s.hi();
    }
}

class super_01 {
    public super_01() {
        System.out.println("super_01 no args constructor");
    }

    public super_01(int n) {
        System.out.println("super_01 has args constructor");
    }

    public super_01(int n, String s) {
        System.out.println("super_01 has two args constructor");
    }

    public int n1 = 1;

    protected int n2 = 2;

    private int n3 = 3;

    int n4 = 4;

    public void test01() {
        System.out.println("super_01");
    }

    protected void test02() {
        System.out.println("super_02");
    }

    private void test03() {
        System.out.println("super_03");
    }

    void test04() {
        System.out.println("super_04");
    }
}

class super_02 extends super_01 {
    // 访问父类的属性
    public void hi() {
        System.out.println(super.n1);
        System.out.println(super.n2);
        // System.out.println(super.n3); //private不行
        System.out.println(super.n4);
    }

    public void ok() {
        super.test01();
        super.test02();
        // super.test03(); //private不行
        super.test04();
    }

    public super_02() {
        super(1, "a");
        // super(1);
        // super();
    }
}