package Annotation;

public class SupressWaring_ {
    // 可以精准的选择value控制不产生警告
    // 作用范围和放置的范围相关，主要放在语句，方法，类上
    @SuppressWarnings({ "all", "unused", "unchecked", "……" })
    public static void main(String[] args) {
        /**
         * 当我们不想要看到警告的时候可以使用@SuppressWarnings({""})
         */

    }
}
