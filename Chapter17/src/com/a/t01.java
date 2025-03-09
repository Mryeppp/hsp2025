package com.a;

public class t01 {
    public static void main(String[] args) throws InterruptedException {
        // main线程是一个主线程，为系统的入口，用于执行整个程序
        // 下面的例子可以证明，main线程退出之后，如果还有其他子线程没有执行完毕，进程(程序)不一定退出
        // 当所有的进程结束之后，进程(程序)退出
        // 创建一个线程对象
        Cat cat = new Cat();

        /**
         * 源码解读
         * (1)public synchronized void start(){
         * statr0()
         * }
         * (2)private native void start0()
         * //start0()是本地方法，是JVM调用，底层用c/c++实现
         * //真正实现多线程的效果，就是start0()方法
         * start()方法调用start0()方法之后，该线程并不会立即执行，而是将线程变成了可运行状态
         * 具体什么时候执行取决于cpu，由cpu统一调度
         */

        cat.start();// 启动线程，最终是调用run方法
        // cat.run()只是一个普通方法,并不是真正启动一个线程，就会把run方法执行完毕才会执行下面的代码
        // 说明 当main线程启动一个子线程Thread-0，主线程不会阻塞，会继续执行
        // 这时main线程和Thread-0线程是交替执行
        // 主线程和子线程是交替执行
        for (int i = 0; i < 50; i++) {
            System.out.println("主线程 i=" + i + "线程名称" + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        // 在终端输入jconsole可以监控线程的状态
        // cat.run();//不会启动线程，不会分配新的分支栈，只有主线程，这个方法就是一个普通的方法，没有启动多线程模式

    }
}

// 继承了Thread类，，该类就成为了一个线程。
// 重写了run方法，实现自己的业务逻辑，run方法就是线程体
// Thread类实现了Runnable接口的run方法
// 启动线程：start()方法
// 启动线程不一定立即执行，由cpu调度执行

class Cat extends Thread {
    @Override
    public void run() {
        int times = 0;
        while (true) {
            // 休眠一秒Thread.sleep(1000); 需要快捷键ctrl+alt+t
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("我是一只猫，我在吃第" + ++times + "个包子" + " 线程名=" + Thread.currentThread().getName());
            if (times == 60) {
                break;// 退出了while循环，此时线程也就退出了
            }
        }
    }
}
