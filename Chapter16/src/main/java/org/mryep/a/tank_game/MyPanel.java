package org.mryep.a.tank_game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
    //绘图区域

    //定义我的坦克
    mytank mt = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTanksize = 3;
    public MyPanel() {
        mt = new mytank(100, 100);
        //初始化敌人坦克
        for (int i = 0; i < enemyTanksize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
        }
    }


    //画出我的坦克封装到方法中
    /**
     * @param x 坦克的左上角x坐标
     * @param y 坦克的左上角y坐标
     * @param g 画笔
     * @param direction 坦克方向(上下左右)`
     * @param type 坦克类型
     * @param g 画笔
     * */
    public void drawtank(int x ,int y ,Graphics g,int direction , int type) {
        switch (type) {
            case 0: //绘制我的坦克
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克方向，来绘制坦克
        switch (direction) {
            case 0: // 向上
                g.fill3DRect(x,y, 10,60,false ); // 左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false); // 右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); // 盖子
                g.fillOval(x + 10, y + 20, 20, 20); // 圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y-10); // 炮管
                break;
            case 1: // 向右
                g.fill3DRect(x, y, 60, 10, false); // 上部轮子
                g.fill3DRect(x, y + 30, 60, 10, false); // 下部轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 盖子
                g.fillOval(x + 20, y + 10, 20, 20); // 圆形盖子
                g.drawLine(x + 30, y + 20, x + 70, y + 20); // 向右的炮管
                break;
            case 2: // 向下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 70); // 向下的炮管
                break;
            case 3: // 向左
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x - 10, y + 20); // 向左的炮管
                break;
            default:
                System.out.println("无效方向");
                break;
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        //画出坦克-封装方法
        drawtank(mt.getX(), mt.getY(), g, mt.getDirection(), 0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawtank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        // 处理方向键移动
        if (keyCode == KeyEvent.VK_UP) {
            mt.setDirection(0);
            mt.moveUp();  // 向上移动
        } else if (keyCode == KeyEvent.VK_DOWN) {
            mt.setDirection(2);
            mt.moveDown();  // 向下移动
        } else if (keyCode == KeyEvent.VK_LEFT) {
            mt.setDirection(3);
            mt.moveLeft();  // 向左移动
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            mt.setDirection(1);
            mt.moveRight();  // 向右移动
        }
        // 原有WASD方向设置保持不变
        else if (keyCode == KeyEvent.VK_W) {
            mt.setDirection(0);
        } else if (keyCode == KeyEvent.VK_S) {
            mt.setDirection(2);
        } else if (keyCode == KeyEvent.VK_A) {
            mt.setDirection(3);
        } else if (keyCode == KeyEvent.VK_D) {
            mt.setDirection(1);
        }


        this.repaint();
    }

        // 移除错误的keyTyped实现（保持空方法体即可）
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
