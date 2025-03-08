package Homework;

public class Homework04 {
    public static void main(String[] args) {
        CellPhone cellphone = new CellPhone();
        int res01 = cellphone.TestWork(new Computer() {
            @Override
            public int work(int n1, int n2) {
                return n1 + n2;
            }
        }, 8, 10);
        System.out.println(res01);

        int res02 = cellphone.TestWork(new Computer() {
            @Override
            public int work(int n1, int n2) {
                return n1 * n2;
            }
        }, 8, 10);
        System.out.println(res02);

    }
}

interface Computer {
    public int work(int n1, int n2);

}

class CellPhone {

    int TestWork(Computer computer, int n1, int n2) {
        return computer.work(n1, n2);
    }

}