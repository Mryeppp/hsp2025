package SingleTon;

// 单例设计模式  饿汉式 懒汉式
//设计模式 是大量的实践总结的优选代码结构，编程风格，思考方式。
//可以免去自己的思考和摸索时间
public class singleton {
    public static void main(String[] args) {
        // 通过方法直接获取对象 快捷键：GirFriend.getGFinstance().var
        GirFriend gFinstance = GirFriend.getGFinstance();
        System.out.println(gFinstance.toString()); // xhh
        System.out.println(gFinstance); // xhh
        /**
         * ?为什么会有结果？
         * toString()方法是默认的吗？
         */

    }
}

/**
 * 单例模式 是指对某个类只能存在一个对象实例，并且该类只提供一个取得对象实例的方法
 */
// 饿汉式
class SingleTon01 {
    /**
     * 构造方法私有化 目的 ：防止new一个对象
     * 类的内部创建对象
     * 暴露一个静态公共方法
     */
    private SingleTon01() {
    }

    private static SingleTon01 instance01 = new SingleTon01();

    public static SingleTon01 getinstance() {
        return instance01; // 上文不写static 则这里不能直接return instance01
    }

}

// 懒汉式
class SingleTon02 {
    private SingleTon02() {
    }

    private static SingleTon02 instance02;

    public static SingleTon02 getinstance() {
        if (instance02 == null) {
            instance02 = new SingleTon02();
        }
        return instance02;
    }

}

/** 练习 */

class GirFriend {
    private String name;

    private GirFriend(String name) {
        this.name = name;
    }

    public static GirFriend gf = new GirFriend("xhh");

    public static GirFriend getGFinstance() {
        return gf;
    }

    @Override
    public String toString() {
        return name;
    }
}

/** 懒汉式 静态内部类实现单例模式 */
class SingleTon03 {

    private SingleTon03() {
    }

    private static class SingleTon03_InnerClass {
        private static final SingleTon03 s03 = new SingleTon03();
        // 加上static 下面才能return
    }

    public SingleTon03 getSingleTon03() {
        return SingleTon03_InnerClass.s03;
    }
}