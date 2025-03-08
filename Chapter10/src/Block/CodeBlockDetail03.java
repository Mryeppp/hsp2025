package Block;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
    }
}

/**
 * 继承关系下代码块的执行顺序（面试题） //解析:
 * 
 * 1.父类的静态代码块和静态方法（按照定义顺序执行） // new 子类会调用子类默认的super方法
 * 2.子类的静态代码块和静态方法 //子类调用静态方法会加载父类，由于静态代码块只执行一次所以这里开始执行父类的普通代码块和普通方法
 * 3.父类的普通代码块和普通方法
 * 4.父类的构造器
 * 5.子类的普通代码块和普通方法
 * 6.子类的构造器
 *
 * 7.静态代码块只能直接调用静态成员(静态属性或者静态方法)，普通代码块能调用任意成员
 * 
 */

class Computer {
    public Computer() {
        System.out.println("Computer的无参构造器");
    }

    {
        System.out.println("Computer的普通代码块");
    }
    static {
        System.out.println("Computer的静态代码块");
    }

    private int num = GetComNum();

    private int GetComNum() {
        System.out.println("get Computer num");
        return 100;
    }

    private static int ComSnum = GetComSNum();

    private static int GetComSNum() {
        System.out.println("get Computer static num");
        return 200;
    }

}

class Mobile extends Computer {
    public Mobile() {
        System.out.println("Mobile的无参构造器");
    }

    {
        System.out.println("Mobile的普通代码块");
    }
    static {
        System.out.println("Mobile的静态代码块");
    }

    private int num = GetMobNum();

    private int GetMobNum() {
        System.out.println("get Mobile num");
        return 100;
    }

    private static int MobSnum = GetMobSNum();

    private static int GetMobSNum() {
        System.out.println("get Mobile static num");
        return 200;
    }
}
