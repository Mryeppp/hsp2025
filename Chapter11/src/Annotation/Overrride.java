package Annotation;

public class Overrride {
    public static void main(String[] args) {

    }
}

class Father {
    void fly() {
        System.out.println("fly father");
    }
}

class Son extends Father {
    @Override
    // @Override只能修饰方法
    void fly() {
        System.out.println("fly son");
    }
    /**
     * @Override 价值在于语法校验，要是胡乱重写则会报错
     *           //@Target(ElementType.METHOD)
     *           //@Target说明了其作用目标 ，@Target是修饰注解的注解，叫元注解
     *           //@Retention(RetentionPolicy.SOURCE)
     *           //public @interface Override {}
     * @interface注解类
     * 
     */
}