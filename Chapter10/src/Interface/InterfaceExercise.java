package Interface;

public class InterfaceExercise {

}

interface Ex_A {
    int x = 0;
}

class EX_B {
    int x = 1;
}

class EX_C extends EX_B implements Ex_A {
    public void Px() {
        // System.out.println(x); 不明确x是谁
        System.out.println(super.x);
        System.out.println(Ex_A.x);

        // 调用的方式不同一个在于访问父类成员有super方法，一个在于static关键字
        // 含有static关键字的能不创建实例直接调用(static way),例如 EX_A.x
    }

    public static void main(String[] args) {
        new EX_C().Px();
    }
}
