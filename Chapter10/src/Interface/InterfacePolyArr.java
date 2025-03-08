package Interface;

public class InterfacePolyArr {
    // 接口的多态性
    /**
     * 1.接口的多参数性 package Chapter10.Interface Computer.java
     * 里面有展示了phone，camera都可以作为参数被接口接收
     * 2.多态数组
     * 3.接口的多态传递 请看InterfacePolyPass.java
     */
    public static void main(String[] args) {
        USB usb[] = new USB[2];
        usb[0] = new Phone01();
        usb[1] = new Camera01();
        for (int i = 0; i < usb.length; i++) {
            if (usb[i] instanceof Phone01) { //// 动态绑定..
                /**
                 * “instanceof” 在编程语言中通常用于判断一个对象是否是某个特定类的实例。
                 * 例如在 Java 中，如果一个对象 obj 要判断是否是某个类 ClassA 的实例，可以使用 “obj instanceof ClassA”
                 * 这样的表达式。
                 * 如果 obj 是 ClassA 的实例或者是 ClassA 的子类的实例，这个表达式就会返回 true，否则返回 false。
                 */
                ((Phone01) usb[i]).call();
            }
        }

    }
};

interface USB {
    void name();

}

class Phone01 implements USB {
    public void call() {
        System.out.println("call Phone01");
    }

    @Override
    public void name() {
        System.out.println("Phone01 override");
    }

}

class Camera01 implements USB {
    @Override
    public void name() {
        System.out.println("Camera01 override");
    }

}