package Block;

public class CodeBlock01 {
    /** 修饰符只能是static或者不写，所以代码块分为静态代码块和普通代码块 */
    public static void main(String[] args) {
        Movie movie = new Movie("aaa", 2, "bbb");
    }
}

class Movie {

    private String name;
    private double price;
    private String director;
    // 三个重载构造器 都有相同的语句，代码冗余
    /** 这时候把相同代码放到代码块中 */
    static {
        // 加入 static 变成静态代码块，随着类的加载而执行一次；如果是普通代码块，则每次创建对象都会执行
        System.out.println("电影打开");
        System.out.println("电影广告开始");
        System.out.println("电影开始");
        // 不管调用哪个构造器，都会调用代码块里的语句
        // 代码块调用的顺序优先于构造器
    }

    public Movie(String name) {
        System.out.println("Movie(String name)被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        // System.out.println("电影打开");
        // System.out.println("广告开始");
        // System.out.println("电影开始");
        System.out.println("Movie(String name, double price)被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        // System.out.println("电影打开");
        // System.out.println("电影广告开始");
        // System.out.println("电影开始");
        System.out.println("Movie(String name, double price, String director)被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }

}