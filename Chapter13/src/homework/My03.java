package homework;

import java.util.Scanner;

public class My03 {

    // HAN SHUN PING -> PING HAN.S
    static void format() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] target = name.split(" ");
        // [han , shun , ping]
        // sout (s[02]+" " + s[00] + char c "H")
        char[] ch = target[1].toCharArray();
        char c = Character.toUpperCase(ch[0]);
        System.out.println(target[2] + "," + target[0] + "." + c);

        scanner.close();
    }

    public static void main(String[] args) {
        format();
    }
}
