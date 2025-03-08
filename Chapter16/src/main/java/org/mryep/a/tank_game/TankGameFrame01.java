package org.mryep.a.tank_game;

import javax.swing.JFrame;

public class TankGameFrame01 extends JFrame{

    private MyPanel mp = null; 
    public TankGameFrame01() {
        MyPanel mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    } 

    public static void main(String[] args) {
        TankGameFrame01 tankGameFrame01 = new TankGameFrame01();
    }
}
