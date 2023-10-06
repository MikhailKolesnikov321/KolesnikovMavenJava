package Task2;

import java.util.Scanner;

public class MaxRepeatingSymbol {
    public static void searchMax(String str) {
        int count = 1, temp = 0;
        char symbol = ' ';
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
            if (count > temp && str.charAt(i) != str.charAt(i + 1)) {
                temp = count;
                symbol = str.charAt(i);
                count = 1;
            }
            if (count > temp && str.length() == i + 2) {
                temp = count;
                symbol = str.charAt(i);
                break;
            }
        }
        System.out.println("Первый наиболее часто повторяющийся символ -- " + symbol);
    }

    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        str = in.nextLine();
        searchMax(str);
    }
}
