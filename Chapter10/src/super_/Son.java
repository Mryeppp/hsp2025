package super_;

class Son extends MyFather {
    private int age;
    private String name;

    public Son() {
    };

    public Son(int age, String name) {
        // super(age, name); 错误
        // 在使用 super() 调用父类构造函数时，一定要注意不能直接使用 this 引用实例字段
        // 因为此时子类实例尚未完全初始化，可能导致不可预期的行为。
        // 正确的做法是使用方法的参数或者局部变量传递给父类构造函数所需的信息。
        super(age, name);
    }

    // public int getAge() {
    // return age;
    // }
    // public String getName() {
    // return name;
    // }
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getMoney() {
        super.getMoney();
    }

}
