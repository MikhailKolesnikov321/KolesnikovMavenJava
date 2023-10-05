package Task2;

import java.util.Scanner;

public class NumberTwoCounter {
    public static int Counter(int n){
        int counter = 0;
        for(int i = 0; i<=n; i++){
            int temp = i;
            while(temp>0){
                if(temp%10 == 2){
                    counter++;
                }
                temp = temp/10;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел n");
        int n = in.nextInt();
        System.out.println(Counter(n));
    }
}
