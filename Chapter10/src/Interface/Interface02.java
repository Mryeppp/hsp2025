package Interface;

public class Interface02 {
    public static void main(String[] args) {

    }
}

class A implements Ainterface {
    // 需要实现接口的所有抽象方法 alt+enter
    @Override
    public void hi() {
        System.out.println("say hi");
    }
}
