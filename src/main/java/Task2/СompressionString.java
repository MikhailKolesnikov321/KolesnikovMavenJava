package Task2;

import java.util.Scanner;

public class СompressionString {
    public static String compress(String str) {
        StringBuilder compressedStr = new StringBuilder();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedStr.append(str.charAt(i));
                compressedStr.append("(");
                count = 0;
            }
        }
        if (compressedStr.length() > str.length()) {
            return str;
        }
        String result = compressedStr.toString();
        return result;
    }

    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        str = in.nextLine();
        System.out.println(compress(str));
    }
}
