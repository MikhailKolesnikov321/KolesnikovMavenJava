package Task2;

import java.util.Scanner;

public class СompressionString {
    public static String compress(String str) {
        StringBuilder compressedstr = new StringBuilder();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedstr.append(str.charAt(i));
                compressedstr.append(count);
                count = 0;
            }
        }
        if (compressedstr.length() > str.length()) {
            return str;
        }
        String result = compressedstr.toString();
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
