package Task2;

import java.util.Scanner;
import java.util.Stack;

public class ValidateBrackets {
        public static boolean validate(String str) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == '}' || ch == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char openingBracket = stack.pop();
                    if ((ch == ')' && openingBracket != '(') ||
                            (ch == '}' && openingBracket != '{') ||
                            (ch == ']' && openingBracket != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
        public static void main(String[] args) {
            String str;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку со скобками ");
            str = in.nextLine();
            boolean isValid = validate(str);
            if (isValid) {
                System.out.println("Скобки сбалансированы.");
            } else {
                System.out.println("Скобки не сбалансированы.");
            }
        }
}
