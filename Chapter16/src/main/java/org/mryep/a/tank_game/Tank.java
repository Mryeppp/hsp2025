package org.mryep.a.tank_game;

public class Tank {
    
     //坦克位置
     private int x = 0;
     private int y = 0;
     int type = 0; //0 表示我的坦克 1 表示敌人的坦克
     private int direction = 0; //0 向上 1 向右 2 向下 3 向左
     private int speed = 1;

    public void moveUp() {
        y -= speed;
    }
    public void moveRight() {
        x += speed;
    }
    public void moveDown() {
        y += speed;
    }
    public void moveLeft() {
        x -= speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;

    }

    
}
