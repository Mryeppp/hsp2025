package homework;

public class myreverse {

    static String reveString(String s, int start, int end) {
        // "acbde" -> "edcba"
        char[] c = s.toCharArray();
        int i = start;
        int j = end;
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);

    }

    static void show(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(c[i]);
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        reveString(s, 0, 2);
        show(reveString(s, 0, 5));
    }
}
