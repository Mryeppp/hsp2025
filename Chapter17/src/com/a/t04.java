package com.a;
public class t04{
  public static void main(String[] args) {
    
  }
}
calss SaleWindows extends Thread {
  @Override 
  int tickets = 1000 ;
  public void run() {
    whlile (true) {
      if(tickets <= 0) { break; }
      try {
        Thread.sleep(1000)
      } catch (InterruptException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "买了一张票，剩余票数 " + --tickets);
    }
  }
}
