package com.a;

public class t02 {
  public static void main(String[] args) {
    /*
     * 说明
     * 1. Java 是单继承的，某些情况下一个类已经继承了某个父类，无法使用继承Thread类的方式创建线程
     * 2. 所以还可以实现Runnable接口来创建线程
     * 这里底层使用了设计模式[静态代理]
     *
     */
    Dog dog = new Dog();
    // 由于Runnable 只有run()方法，所以不难想到将dog传入一个Thread对象中，来借用start()方法
    Thread thread_dog = new Thread(dog);
    thread_dog.start();

    Tiger tiger = new Tiger();
    Threadproxy thread_tiger = new Threadproxy(tiger);
    thread_tiger.start();

  }
}

// 模拟极简的Thread类
class Threadproxy implements Runnable {
  private Runnable target = null; // 创建属性 类型为Runnable

  @Override
  public void run() {
    if (target != null) {
      target.run();
    }
  }

  // 构造器
  public Threadproxy(Runnable target) {
    this.target = target;
  }

  public void start() {
    start0();
  }

  public void start0() {
    run();
  }
}

class Dog implements Runnable {
  // 实现Runnable接口来创建线程
  int count = 0;

  @Override
  public void run() {
    while (true) {
      System.out.println("小狗汪汪叫...hi" + (count++) + Thread.currentThread().getName());

      // 休眠一秒
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if (count == 10) {
        break;
      }
    }
  }
}


class Animal{}
class Tiger extends Animal implements Runnable{
  @Override
  public void run(){
    System.out.println("老虎嗷嗷叫");
  }
}
