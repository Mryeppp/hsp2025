package Homework;

public class Homework02 {
    public static void main(String[] args) {

    }
}

class Frock {
    private static int currentNum = 100000;
    public int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    static int getNextNum() {
        return currentNum += 100;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

}

class TestFrock {
    public static void main(String[] args) {

        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        System.out.println("****************************");
        Frock frock01 = new Frock();
        Frock frock02 = new Frock();
        Frock frock03 = new Frock();
        int a = frock01.getSerialNumber();
        int b = frock02.getSerialNumber();
        int c = frock03.getSerialNumber();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
