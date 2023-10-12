package Task2;

import java.util.Scanner;

public class AddBrackets {
    public static String add(String str){
        StringBuilder addBrackets = new StringBuilder();
        for (int i = 0; i < (str.length()+1)/2; i++) {
                addBrackets.append("(");
                addBrackets.append(str.charAt(i));
        }
        for (int i = (str.length()+1)/2; i < str.length(); i++) {
                addBrackets.append(")");
                addBrackets.append(str.charAt(i));
        }
        addBrackets.append(")");
        String result = addBrackets.toString();
        return result;
    }
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        str = in.nextLine();
        System.out.println(add(str));
    }
}
