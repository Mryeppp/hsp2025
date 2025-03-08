package super_;

class MyFather {
    public MyFather() {
    };

    private int age;
    private String name;

    public MyFather(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getMoney() {
        System.out.println(name + "get Money");
    }
}
