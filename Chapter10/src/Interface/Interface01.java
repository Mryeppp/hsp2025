package Interface;

public class Interface01 {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();

        computer.work(camera);
        computer.work(phone);

        MyInterface01 myInterface01 = new MyInterface01();
        myInterface01.bye();
        myInterface01.hi();
        myInterface01.say();

    }
}
// 1.接口就是给出一些没有实现的方法封装到一起，到某个类要使用的时候根据具体情况把这些方法写出来
/*
 * class 类名 implements 接口{
 * 自己属性；
 * 自己方法；
 * 必须实现的抽象方法；
 * }
 */

// alt+enter 重写快捷键
interface InterfaceA {
    public void hi();

    public void bye();
    // 2.接口中可以省略抽象关键字,因为接口中的方法肯定是抽象方法
    // 3. 接口的方法都是public的
}

abstract class Tiger implements InterfaceA {
    // 4.抽象类实现接口，可以不用实现接口的方法
}

// 5.一个类可以实现多个接口
interface Ib extends InterfaceA {
    void hi();

    int a = 1;// 6.接口中的属性都是public static final的
    public static final int b = 2;
    // 7.接口中的属性访问：接口名.属性
    // 8.接口不能继承类，但是可以继承多个个接口
    // 9.接口的修饰符只能是public和默认，这和类是一样的。
}

interface Ic {
    void say();
}

class MyInterface01 implements Ib, Ic {

    @Override
    public void hi() {
        System.out.println("hi");
    }

    @Override
    public void say() {
        System.out.println("say");
    }

    @Override
    public void bye() {
        System.out.println("extends bye");
    }
}
