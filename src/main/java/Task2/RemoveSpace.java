package Task2;

import java.util.Scanner;
import java.util.SplittableRandom;

public class RemoveSpace {
    public static String remove(String str){
        StringBuilder result = new StringBuilder();
        boolean isSpace = false;

        for (char c : str.toCharArray()) {
            if (c == ' ') {
                if (!isSpace) {
                    result.append(c);
                }
                isSpace = true;
            } else {
                result.append(c);
                isSpace = false;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        str = in.nextLine();
        System.out.println(remove(str));
    }
}
