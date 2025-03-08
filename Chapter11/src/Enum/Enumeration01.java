package Enum;

//枚举类的引出
//自定义枚举类可以有两种方式，更推荐使用enum关键字来定义枚举类。
//所有通过enum关键字定义的枚举类都继承自java.lang.Enum类，要了解该类的常用方法的使用。
public class Enumeration01 {

    /**
     * 性别枚举类
     */
    static class Sex {

        // 定义常量
        private final String sexName;

        // 私有化构造器，不提供外部实例化
        private Sex(String sexName) {
            // 在构造器中为属性赋值
            this.sexName = sexName;
        }

        // 内部创建对象
        public static final Sex MALE = new Sex("男");
        public static final Sex FEMALE = new Sex("女");
        public static final Sex UNKNOWN = new Sex("保密");

        /**
         * 只保留getter，不提供setter
         */
        public String getSexName() {
            return sexName;
        }

        /**
         * 重写toString方法，方便外部打印调试
         */
        @Override
        public String toString() {
            return "Sex{" +
                    "sexName='" + sexName + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println(Sex.FEMALE.getSexName());
        System.out.println(Sex.MALE.getSexName());
        System.out.println(Sex.UNKNOWN.getSexName());
        System.out.println(Sex.FEMALE);
    }

}

class run {
    public static void main(String[] args) {
        A male = A.MALE;
        System.out.println(male);
        System.out.println(male.toString());// 不必要的 'toString()' 调用

        System.out.println(male.getSexName());
        System.out.println("*************************************");

        System.out.println("Enum类的values()");
        A[] values = A.values();
        for (A value : values) {
            System.out.println(value);
        } // 枚举类的遍历方法

        System.out.println("Enum类的valueOF");
        A a = A.valueOf("MALE");
        System.out.println(a); // 输出MALE
    }
}

enum A {
    MALE("男"),
    FEMALE("女"),
    UNKONW("未知");

    private final String SexName;

    private A(String sexName) {
        SexName = sexName;
    }

    public String getSexName() {
        return SexName;
    }
}
