package Block;

public class StaticCodeBlock03 {
    public static void main(String[] args) {
        System.out.println(Microwave.a);
        // Microwave.On();
    }
}

class Microwave {
    static {
        System.out.println("test 直接调用类的静态方法 静态属性类会加载，静态代码块会被调用");
    }
    static int a = 10;

    public static void On() {
        System.out.println("Microwave on");
    }
}
