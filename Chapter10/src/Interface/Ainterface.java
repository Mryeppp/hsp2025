package Interface;

public interface Ainterface {
    // 写属性 写方法
    public int n1 = 10;

    abstract public void hi();

    default public void ok() {
        // 可以有默认实现方法，但是需要default关键字
        System.out.println("ok...");
    }

    public static void cry() {
        // 可以有静态实现方法
        System.out.println("cry...");
    }
}
