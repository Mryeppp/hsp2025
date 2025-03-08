package Homework;

public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private final String NAME = "name in A";

    void f1() {
        class B {
            private final String NAME = "name in B";

            void show() {
                System.out.println(NAME);
                System.out.println(A.this.NAME);
            }

        }
        B b = new B();
        b.show();
    }

}