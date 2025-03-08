package Block;

public class CodeBlockDetail02 {
    public static void main(String[] args) {

        BBB bbb = new BBB();
        /**
         * AAA 普通代码块01
         * BBB 普通代码块01
         * B 的构造器被调用
         */
    }

}

// class AAA {

// {
// System.out.println("AAA 普通代码块01");
// }

// public AAA() {
// /** 这里有隐藏的执行要求 1.super() 2.普通代码块 */
// super();// 不写默认存在，调用父类无参构造器。

// }
// }

// class BBB extends AAA {
// {
// System.out.println("BBB 普通代码块01");

// }

// public BBB() {
// System.out.println("B 的构造器被调用");
// }
// }
class AAA {
    {
        System.out.println("AAA 代码块");
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB 代码块");
    }

    public BBB() {
        System.out.println("B的构造函数");
    }
}