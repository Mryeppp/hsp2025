// package org.mryep.a;
// import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.Image;
// import java.awt.Panel;
// import java.awt.Toolkit;

// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class draw extends JFrame {
//     @SuppressWarnings({"all"})
//     public static void main(String[] args) {
//         new draw();
//     }
//     private MyPanel mp = null;
//     public draw() {
//         //初始化面板
//         mp = new MyPanel();
//         //将面板放入窗口
//         this.add(mp);
//         //设置窗口的大小
//         this.setSize(400,500);
//         this.setVisible(true); //显示
//     }
// }
// class MyPanel extends JPanel{
//     public MyPanel() {}
//     @Override
//     public void paint(Graphics g){
//         super.paint(g);
//         g.setColor(Color.red);
//         g.drawLine(10, 10, 200, 200);
//          //画出一个圆形.
//         //g.drawOval(10, 10, 100, 100);


//         //演示绘制不同的图形..
//         //画直线 drawLine(int x1,int y1,int x2,int y2)
//         //g.drawLine(10, 10, 100, 100);
//         //画矩形边框 drawRect(int x, int y, int width, int height)
//         //g.drawRect(10, 10, 100, 100);
//         //画椭圆边框 drawOval(int x, int y, int width, int height)
//         //填充矩形 fillRect(int x, int y, int width, int height)
//         //设置画笔的颜色
//         //g.setColor(Color.blue);
//         // g.fillRect(10, 10, 100, 100);

//         //填充椭圆 fillOval(int x, int y, int width, int height)
//         // g.setColor(Color.red);
//         //g.fillOval(10, 10, 100, 100);

//         //画图片 drawImage(Image img, int x, int y, ..)
//         //1. 获取图片资源, /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
//         //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
//         //g.drawImage(image, 10, 10, 175, 221, this);
//         //画字符串 drawString(String str, int x, int y)//写字
//         //给画笔设置颜色和字体
//         Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/a.jpg"));
//         g.drawImage(image, 10,10,WIDTH, WIDTH, this);
//         // g.setColor(Color.red);
//         // //这里设置的 100， 100， 是 "北京你好"左下角
//         // g.drawString("北京你好", 100, 100);
//         //设置画笔的字体 setFont(Font font)
//         //设置画笔的颜色 setColor(Color c)
//     }
// }
