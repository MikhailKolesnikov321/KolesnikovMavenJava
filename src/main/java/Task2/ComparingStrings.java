package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class ComparingStrings {
    public static boolean Compare(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        char[] arrayStr1 = str1.toCharArray();
        char[] arrayStr2 = str2.toCharArray();
        Arrays.sort(arrayStr1);
        Arrays.sort(arrayStr2);
        return Arrays.equals(arrayStr1, arrayStr2);
    }
    public static void main(String[] args) {
        String str1, str2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку");
        str1 = in.nextLine();
        System.out.println("Введите вторую строку");
        str2 = in.nextLine();
        if(Compare(str1, str2)){
            System.out.println("Строки являются перестановкой");
        }else{
         System.out.println("Строки не являются перестановкой");
        }
    }
}
