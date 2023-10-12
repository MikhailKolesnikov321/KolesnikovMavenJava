package Task2;

import java.util.Scanner;

public class IdenticalPairs {
    public static int numberOfIdenticalPairs(int[] nums) {
        for(int j = 0; j < nums.length-1; j++){
            for (int i = 1; i < nums.length; i++){
                if(i == j){
                    continue;
                }
                if(nums[j] == nums[i] && j < i){
                    System.out.print("(" + j + "," + i + "); ");
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 5 чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("\n-----------------\n");
        numberOfIdenticalPairs(array);
    }
}
