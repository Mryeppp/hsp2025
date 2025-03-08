package Interface;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        // 接口的多态体现
        // 接口类型的变量 if01 可以指向 实现了 该接口的类 IF的实例
        IF if01 = new Monster();
        if01 = new car();
        /*---------------------  */

        // 父类变量AAA 可以指向AAA子类的对象实例
        AAA AAA = new BBB();
        AAA = new CCC();

    }
}

interface IF {

}

class Monster implements IF {

}

class car implements IF {

}

/** ------------------ */
class AAA {
}

class BBB extends AAA {
}

class CCC extends BBB {
}