package Interface;

public class ExtendsVSInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("wukong");

        wukong.swimming();
        wukong.climbing();
    }
}

class Monkey {
    private String name;

    // 删去无参构造，为子类添加super方法

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + " " + "can climb");
    }

    public String Getname() {
        return name;
    }
}

interface Fishnable {
    // 接口的方法一定是个抽象方法
    public void swimming();
}

class LittleMonkey extends Monkey implements Fishnable {
    // private String name;

    public LittleMonkey(String name) {
        super(name);
    }

    public String GetLittleMonkeyName() {
        return Getname();
    }

    @Override
    public void swimming() {
        System.out.println(Getname());

        System.out.println(GetLittleMonkeyName() + " " + "can swim");

    }
}
// 小结: 当子类继承了父类，就自动的拥有父类的功能
// 如果子类需要扩展功能，可以通过实现接口的方式扩展.
// 可以理解 实现接口 是 对 java 单继承机制的一种补充.
// 接口在一定程度上实现了代码解耦（即：接口规范性和动态绑定）