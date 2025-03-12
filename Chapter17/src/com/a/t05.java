package com.a;

// 终止线程 之 通知方式 
public class t05 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            t1.setLoop(false);
            // 希望main线程控制t1线程的终止 , 必须做到修改loop
            // 让t1退出run方法，从而终止t1线程 -> 通知方式
        }
    }
}

class T extends Thread {

    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println("hello" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
