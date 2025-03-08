package Exception;

public class self_Exception01 {
    public static void divide01(int a, int b) throws ArithmeticException, AssertionError/* ... */ {
        // throws 关键字定义在方法上，可以理解为汽车运行中出现了故障，只能交给开车的人修复
        // 不同的异常之间可以用逗号隔开
        /**
         * throws 有如下使用规则：
         * 
         * 1.如果方法中全部是非检查异常（即 Error、RuntimeException 以及的子类），那么可以不使用 throws
         * 关键字来声明要抛出的异常，编译器能够通过编译，但在运行时会被系统抛出；
         * 2.如果方法中可能出现检查异常，就必须使用 throws 声明将其抛出或使用 try catch 捕获异常，否则将导致编译错误；
         * 3.当一个方法抛出了异常，那么该方法的调用者必须处理或者重新抛出该异常；
         * 4.当子类重写父类抛出异常的方法时，声明的异常必须是父类所声明异常的同类或子类
         */
        if (b == 0) {
            // 抛出异常
            throw new ArithmeticException("除数不能为零");
        }
        System.out.println(a / b);
    }

    public static void divide02(int a, int b) {
        try {
            // 从可能出现异常的地方放置try语句
            System.out.println(a / b);
        } catch (RuntimeException ArithmeticException) {
            System.out.println("别除0");
            // catch捕获可能出现的异常
            /**
             * 是按照 catch 块的声明顺序从上往下寻找的，一旦匹配，就不会再向下执行。
             * 因此，如果同一个 try 块下的多个 catch异常类型有父子关系，
             * 应该将子类异常放在前面，父类异常放在后面；
             */

        } catch (Exception RuntimeException) {

        } finally {
            System.out.println(a + b);
            /**
             * 无论是否发生异常，都会执行 finally 语句块。
             * 
             * finally 常用于这样的场景：由于 finally 语句块总是会被执行，
             * 所以那些在 try代码块中打开的，并且必须回收的物理资源（如数据库连接、网络连接和文件），
             * 一般会放在 finally 语句块中释放资源。
             */

        }
    }

    public static void main(String[] args) {
        // 调用 divide() 方法
        // divide01(2, 0);
        divide02(2, 0);
        /**
         * 输出：
         * 别除0
         * 2
         */
    }

}
