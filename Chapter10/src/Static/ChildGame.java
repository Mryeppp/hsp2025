package Static;

public class ChildGame {

    public static void main(String[] args) {
        // count 的访问变得很尴尬 没使用到oop编程
        // 因此引出 类变量/静态变量
        // int count = 0;//统计有几个加入了游戏
        // Child child1 = new Child("蜘蛛精");
        // child1.join();
        // count++;
        // Child child2 = new Child("白骨精");
        // child2.join();
        // count++;
        // Child child3 = new Child("老鼠精");
        // child3.join();
        // count++;
        Child child1 = new Child("蜘蛛精");
        child1.join();
        Child child2 = new Child("白骨精");
        child2.join();
        Child child3 = new Child("老鼠精");
        child3.join();

        System.out.println("一共有" + Child.count + "个小孩加入了游戏");
    }
}

class Child {
    public String name;
    public static int count = 0;

    /** 静态变量 */
    /** 静态对象保存在堆中 JDK7+ */
    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
        count++;
    }
}
// static对象是同一个类所有对象共享的，在类加载的时候就生成了。