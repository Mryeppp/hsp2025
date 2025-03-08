package org.mryep.a;

public class custom {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple();
        apple.fly(new Dog());
        apple.fly(10);
        new Apple<String, Integer, Double>().fly(10);
        new Apple<String, Integer, Double>().fly(new Dog());
    }
}

// 普通类
class Car {
    // 普通方法
    public void run() {
        System.out.println("车在跑");
    }

    public <T, R> void fly(T t, R r) { // 泛型方法
        System.out.println("车在飞");
    }
}

// 泛型类
class Car2<T, R> {
    // 普通方法
    public void run() {
        System.out.println("车在跑");
    }

    public void fly(T t, R r) { // 泛型方法
        System.out.println("车在飞");
    }

    public <U, M> void swim(U u, M m) {
        System.out.println("车在游泳");
    }

    // 这不是泛型方法，而是方法使用了类中定义的 泛型
    public void hi(T t) {
        System.out.println("hi");
    }
}

// practice
class Apple<T, R, M> {
    public <E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }
}

class Dog {
}
