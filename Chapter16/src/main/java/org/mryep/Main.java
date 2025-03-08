package org.mryep;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    //定义面板
    private MyPanel mp = null;
    public Main() {
        //初始化面板
        mp = new MyPanel();
        //将面板放入窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,500);
        this.setVisible(true); //显示
    }

    public static void main(String[] args) {
        new Main();
    }
}

class MyPanel extends JPanel {
    public MyPanel() {}
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.drawOval(10, 10, 200, 200);
        //g.drawString("Hello World", 100, 100);
        Image image = Toolkit.getDefaultToolkit().getImage("src/main/resources/a.jpg");
        g.drawImage(image, 0, 0, this);
    }
}