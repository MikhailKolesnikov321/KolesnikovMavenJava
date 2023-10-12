package Task2;

import java.util.Scanner;

public class MaxRepeatingSymbol {
    public static void searchMax(String str) {
        int count = 1, temp = 0;
        char symbol = ' ';
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if(count > temp){
                    temp = count;
                    symbol = str.charAt(i);
                }
            }else{
                count = 1;
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
