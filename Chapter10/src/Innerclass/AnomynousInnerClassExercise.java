package Innerclass;

public class AnomynousInnerClassExercise {
    public static void main(String[] args) {

        method(new Picture()); // 传统方法硬编码，不灵活

        method(new IL() {

            @Override
            public void show() {
                System.out.println("show");
            }
        }); // 匿名类是一个对象，可以当作实参，适用于某个类只用一次，这样不用创建类的实例
    }

    public static void method(IL il) {
        il.show();
    }
}

interface IL {
    void show();
}

class Picture implements IL {

    @Override
    public void show() {
        System.out.println("Picture");
    }
}
