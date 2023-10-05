package Task2;

import java.util.Scanner;

public class MaxRepeatingSymbol {
    public static void searchMax(String str){
        int count = 1, temp = 0;
        for(int i = 0; i < str.length(); i++){
            if(i < str.length() && str.charAt(i) == str.charAt(i + 1)){
                count++;
            }
        }
    }
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        str = in.nextLine();
    }
}
