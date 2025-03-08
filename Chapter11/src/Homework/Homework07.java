package Homework;

import Homework.Car_Homework07.Air;

@SuppressWarnings("unused")
public class Homework07 {
    public static void main(String[] args) {
        new Car_Homework07(40.0).new Air().flow();

    }
}

class Car_Homework07 {
    private double TEMP;

    public Car_Homework07(double TEMP) {
        this.TEMP = TEMP;
    }

    class Air {

        public void flow() {
            if (TEMP >= 40.0) {
                System.out.println("cold wind");
            } else if (TEMP <= 0.0) {
                System.out.println("warm wind");
            } else {
                System.out.println("shut down");
            }
        }
    }

}