package homework;

import java.util.Scanner;

public class MyHomework02 {
    public static void Login() {

        Scanner scanner = new Scanner(System.in);

        String usr_name, usr_passwd, usr_mail;

        System.out.print("用户名： ");
        usr_name = scanner.nextLine();
        vetify_name(usr_name);

        System.out.print("密码： ");
        usr_passwd = scanner.nextLine();
        vetify_passwd(usr_passwd);

        System.out.print("邮箱： ");
        usr_mail = scanner.nextLine();
        vetify_mail(usr_mail);

        System.out.println("Success");
        scanner.close();
    }

    static void vetify_name(String s) {
        if ((s.length() != 2) && (s.length() != 3) && (s.length() != 4)) {
            throw new RuntimeException("用户名长度要求2-4");
        }
    };

    static void vetify_passwd(String s) {

        for (char c : s.toCharArray()) {
            if (!(Character.isDigit(c)) && s.length() != 6) {
                throw new RuntimeException("密码格式要求必须全是数字,且长度要求为6");
            }
        }

    } // isdecimal

    static void vetify_mail(String s) {
        int i = s.indexOf('@');
        int j = s.indexOf('.');
        if (!(i != -1 && j != -1 && i < j)) {
            throw new RuntimeException("邮箱格式不正确");
        }
    };

    public static void main(String[] args) {
        Login();
    }
}

// package homework;

// import java.util.Scanner;

// public class MyHomework02 {
// public static void Login() {
// Scanner scanner = new Scanner(System.in);
// String usr_name, usr_passwd, usr_mail;

// while (true) {
// System.out.print("用户名 : ");
// usr_name = scanner.nextLine();
// if (verifyName(usr_name))
// break;
// System.out.println("用户名长度要求2-4，请重新输入。");
// }

// while (true) {
// System.out.print("密码 : ");
// usr_passwd = scanner.nextLine();
// if (verifyPasswd(usr_passwd))
// break;
// System.out.println("密码长度要求为6，且必须全是数字，请重新输入。");
// }

// while (true) {
// System.out.print("邮箱 : ");
// usr_mail = scanner.nextLine();
// if (verifyMail(usr_mail))
// break;
// System.out.println("邮箱格式不正确，请重新输入。");
// }

// System.out.println("Success");
// scanner.close();
// }

// static boolean verifyName(String s) {
// return s.length() >= 2 && s.length() <= 4;
// }

// static boolean verifyPasswd(String s) {
// if (s.length() != 6)
// return false;
// for (char c : s.toCharArray()) {
// if (!Character.isDigit(c))
// return false;
// }
// return true;
// }

// static boolean verifyMail(String s) {
// int i = s.indexOf('@');
// int j = s.indexOf('.');
// return i != -1 && j != -1 && i < j;
// }

// public static void main(String[] args) {
// Login();
// }
// }