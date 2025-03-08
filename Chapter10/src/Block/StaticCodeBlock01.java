package Block;

public class StaticCodeBlock01 {
    public static void main(String[] args) {
        Movie02 movie02A = new Movie02("a");
        // 先创建的先调用代码块
        Movie02 movie02B = new Movie02("a", 5);
    }
}

class Movie02 {

    private String name;
    private int price;

    public Movie02(String name) {
        System.out.println("Movie02(String name)");
        this.name = name;
    }

    public Movie02(String name, int price) {
        System.out.println("Movie02(String name, int price)");
        this.name = name;
        this.price = price;
    }

    // 加入 static 变成静态代码块，随着类的加载而执行一次；如果是普通代码块，则每次创建对象都会执行
    {
        System.out.println("test normal CodeBlock");

    }

    static {
        System.out.println("movie prepare");
        System.out.println("advertise on ");
        System.out.println("movie on");
    }
    // 既然静态代码块是在类加载的时候调用
    // 那么类加载的三种情况如下：
    /*
     * 创建对象 new
     * 创建子类对象 父类会被加载
     * 使用类的静态方法静态属性时
     * 本文件时第一种情况，其余两种情况分别在StaticCodeBlock02以及StaticCodeBlock03中
     */
}