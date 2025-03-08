package org.mryep.a;
//java的事件控制

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ball extends  JFrame{
    
    BallPanel mp = null;
    public ball(){
        mp = new BallPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp); //将mp添加为事件监听器 !!!!
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
       ball b = new ball();
    }
}


class BallPanel extends JPanel implements KeyListener{

    //为了让小球移动将坐标设置为变量
    int x = 10;
    int y = 10;

    //监听器 监听键盘事件
   public BallPanel(){}
   @Override
   public void paint(Graphics g){
     super.paint(g);
     g.fillOval(x,y,10,10); 
   }
   @Override
    public void keyTyped(KeyEvent e) { //监听字符输入
        // TODO Auto-generated method stub
        
    } 
   @Override
    public void keyPressed(KeyEvent e) { //监听按键按下
        
        //System.out.println((char)e.getKeyCode() + "down");
        //根据用户按下的不同键，来处理小球的移动(上下左右)
        if(e.getKeyCode() == KeyEvent.VK_DOWN){ //按下的是下键,让小球下移动
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_UP){ //按下的是上键,让小球上移动
            y--;    
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){ //按下的是左键,让小球左移动
            x--;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){ //按下的是右键,让小球右移动
            x++;
        }
        //位置改变了，需要重绘 !!!
        this.repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) { //监听按键释放
        // TODO Auto-generated method stub
        
    }
     
}