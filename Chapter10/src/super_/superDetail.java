package super_;

public class superDetail {
    /**
     * 调用super方法的好处 ：
     * 分工明确 父类属性父类初始化 子类属性子类初始化
     * 当子类和父类的成员(成员即：属性和方法)重名时，想要访问父类成员必须使用super，不重名时，用this.super.直接访问效果相同
     */
    public static void main(String[] args) {
        System.out.println("superDetail");
        MyFather myFather = new MyFather(52, "lyf");
        Son son = new Son(22, "lyp");
        GrandSon grandSon = new GrandSon(2, "ltc");
        // myFather.getMoney();
        // son.getMoney();
        // grandSon.getMoney();

        System.out.println(myFather.getAge());
        System.out.println(myFather.getName());
        System.out.println(son.getAge());
        System.out.println(son.getName());
        System.out.println(grandSon.getAge());
        System.out.println(grandSon.getName());

    }
}

class Run_Acal_BSum {
    public static void main(String[] args) {
        BSum bSum = new BSum(1, 0);
        System.out.println(bSum.sum());
    }
}

class ACal {
    public int cal(int a, int b) {

        return a + b;

    }

}

class BSum extends ACal {
    public int a;
    public int b;

    public BSum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return cal(this.a, this.b);
    }

}
