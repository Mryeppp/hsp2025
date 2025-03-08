package Interface;

public class InterfacePolyPass {
    // 接口的多态性 3.接口的多态传递
    // 指的是接口的多态性可以通过继承关系传递，即一个接口的引用可以指向其实现类的对象
    /*
     * 接口的引用是指声明为接口类型的变量，它可以用来存储实现了该接口的类的对象的引用。
     * 例如，如下PolyPass 是一个接口，当你声明一个变量 PolyPass polyPass; 时
     * polyPass 就是 PolyPass 接口的一个引用。
     * 当你 new 一个 Son_PolyPass 对象时，你可以将这个对象的引用赋给 polyPass。
     * 这样 polyPass 就可以调用 Son_PolyPass 的方法。
     * 这就是指向其实现类Son_PolyPass的对象son_polyPass。
     * 这就是接口的多态传递。
     *
     * 好处：
     * 通过这种方式，代码展示了接口的多态性和多态传递的特性，
     * 使得不同的类可以通过实现同一个接口来提供不同的行为，
     * 并且这些行为可以通过接口类型的变量进行统一调用
     */
    public static void main(String[] args) {
        Son_PolyPass son_polyPass = new Son_PolyPass();
        PolyPass polyPass = son_polyPass;
        polyPass.say(); // 输出 Son_PolyPass

        Father_PolyPass father_polypass = new Father_PolyPass();
        PolyPass polyPass2 = father_polypass;
        polyPass2.say(); // 输出 Father_PolyPass
    }
}

interface PolyPass {
    void say();
}

class Father_PolyPass implements PolyPass {
    @Override
    public void say() {
        System.out.println("Father_PolyPass");
    }
}

class Son_PolyPass extends Father_PolyPass {
    @Override
    public void say() {
        System.out.println("Son_PolyPass");
    }
}