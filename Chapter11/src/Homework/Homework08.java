package Homework;

public class Homework08 {
    public static void main(String[] args) {
        Color_Homework08.RED.show();
        System.out.println("------------");
        Color_Homework08 green = Color_Homework08.GREEN;
        green.show();
        // 比较一下
        // switch () 中，放入枚举对象
        // 在每个case 后，直接写上在枚举类中，定义的枚举对象即可
        switch (green) {
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            default:
                System.out.println("没有匹配到..");
        }
    }
}

interface Color {
    public void show();

}

enum Color_Homework08 implements Color {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color_Homework08(int r, int g, int b) {
        this.redValue = r;
        this.greenValue = g;
        this.blueValue = b;

    }

    @Override
    public void show() {
        System.out.println(this.toString());
        System.out.println("r = " + redValue);
        System.out.println("g = " + greenValue);
        System.out.println("b = " + blueValue);

    }

}