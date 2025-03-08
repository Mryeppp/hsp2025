package Annotation;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
    }
}

@Deprecated
/*
 * 用来修饰过时的成员，不代表不能使用而是不推荐使用
 * 用来做版本升级过度使用
 * 
 * @Retention(RetentionPolicy.RUNTIME)
 * 
 * 作用对象：
 * 
 * @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE,
 * PARAMETER, TYPE})
 */

class A {
    int a = 1;

    void hi() {
    };
}