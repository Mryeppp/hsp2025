package arrays_;

import java.util.Comparator;

public class mybubble {

    static int[] bubble02(int[] arr, Comparator c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return arr;

    }

    static int[] bubble01(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 8, 3, 6, 7 };
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a = (Integer) o1;
                int b = (Integer) o2;
                return a - b;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
