package super_;

class GrandSon extends Son {
    private int age;
    private String name;

    public GrandSon() {
    };

    public GrandSon(int age, String name) {
        super(age, name);
    }

    public int getAge() {
        return super.getAge();

    }

    // 虽然不是强制性的，
    // 但使用 @Override 注解可以让代码更加健壮和易于维护。
    // 它可以确保你确实是在重写父类的方法，而不是无意中定义了一个新的方法
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getMoney() {
        super.getMoney();
    }

}