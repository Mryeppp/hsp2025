package Block;

public class StaticCodeBlock02 {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);

    }
}

// 创建子类时父类会被加载
class Father {
    static {
        System.out.println("Father先被调用 创建子类对象父类会加载，静态代码块被调用");
    }
    public int age = 52;
    public String name = "lyf";
}

class Son extends Father {
    static {
        System.out.println("Son后被调用 new一个Son对象 Son类加载，静态代码块会被调用");
    }
    public String name = "lyp";
    public int age = 22;

}