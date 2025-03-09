package com.a;

public class t03 {
    public static void main(String[] args) {
        T3_1 t3_1 = new T3_1();
        t3_1.start();
        T3_2 t3_2 = new T3_2();
        Thread thread = new Thread(t3_2);
        thread.start();
    }
}

/**
 * 需求
 * 创建俩线程 一个线程每隔一秒输出hello，输出10，退出
 * 一个线程每隔一秒输出hi，输出五次，退出
 */
class T3_1 extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello");
            ++count;
            if (count == 10) {
                break;
            }
        }
    }
}

class T3_2 implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi");
            ++count;
            if (count == 5) {
                break;
            }
        }
    }
}
