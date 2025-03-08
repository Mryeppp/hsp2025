package SingleTon;

public class ExerciseSingleTon01 {
    public static void main(String[] args) {
        Poemitry LeeBai = Poemitry.getLeeBai();
    }
}

class Poemitry {

    private String name;

    private Poemitry(String name) {
        this.name = name;
    }

    public static Poemitry LeeBai = new Poemitry("LeeBai");

    public static Poemitry getLeeBai() {
        System.out.println("创建对象的名字是: " + LeeBai.name);
        return LeeBai;
    }
}
