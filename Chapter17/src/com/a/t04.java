package com.a;

public class t04 {
  public static void main(String[] args) {
    new SaleWindows01().start();
    new SaleWindows01().start();
    new SaleWindows01().start();

    // ######################################################################
    // SaleWindows02 saleWindows04 = new SaleWindows02();
    // new Thread(saleWindows04).start();
    // new Thread(saleWindows04).start();
    // new Thread(saleWindows04).start();

  }
}

class SaleWindows01 extends Thread {

  private static int tickets = 100;
  // 运行时需要创建多个对象，因此需要共享同一份数据

  @Override
  public void run() {
    while (true) {
      if (tickets <= 0) {
        break;
      }
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "买了一张票，剩余票数 " + (--tickets));
    }
  }
}

class SaleWindows02 implements Runnable {

  private int tickets = 100;// 运行时需要创建一个对象，因此没必要共享同一份数据

  @Override
  public void run() {
    while (true) {
      if (tickets <= 0) {
        break;
      }
      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "买了一张票，剩余票数 " + (--tickets));
    }
  }
}

// 问题 需要线程的同步和互斥 否则 会出现超卖的情况