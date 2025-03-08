package stringbuffer_;
/*
        输入商品名称和商品价格，要求打印效果示例, 使用前面学习的方法完成：
        商品名	商品价格
        手机	123,564.59  //比如 价格 3,456,789.88
        要求：价格的小数点前面每三位用逗号隔开, 在输出。
        思路分析
        1. 定义一个Scanner 对象，接收用户输入的 价格(String)
        2. 希望使用到 StringBuffer的 insert ，需要将 String 转成 StringBuffer
        3. 然后使用相关方法进行字符串的处理
         */

import java.util.Scanner;

public class Myself_Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入商品名称
        System.out.print("请输入商品名称: ");
        String productName = scanner.nextLine();

        // 输入商品价格
        System.out.print("请输入商品价格: ");
        String price = scanner.nextLine();

        // 格式化价格
        String formattedPrice = formatPrice(price);

        // 输出结果
        System.out.println("商品名\t商品价格");
        System.out.println(productName + "\t" + formattedPrice);

        scanner.close();
    }

    /**
     * 格式化价格，使小数点前每三位用逗号隔开
     *
     * @param price 原始价格字符串
     * @return 格式化后的价格字符串
     */
    private static String formatPrice(String price) {
        // 找到小数点的位置
        int dotIndex = price.indexOf('.');
        if (dotIndex == -1) {
            dotIndex = price.length(); // 如果没有小数点，则视为整数部分
        }

        // 将价格转换为 StringBuffer 以便操作
        StringBuffer buffer = new StringBuffer(price);

        // 从小数点前一位开始，每三位插入一个逗号
        for (int i = dotIndex - 3; i > 0; i -= 3) {
            buffer.insert(i, ',');
        }

        return buffer.toString();
    }
}