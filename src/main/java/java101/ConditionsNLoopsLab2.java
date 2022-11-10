package java101;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionsNLoopsLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        /*System.out.println("score1");
        int score1 = scanner.nextInt();
        System.out.println("score2");
        int score2 = scanner.nextInt();

        float average = (score1 * 0.6f) + (score2 *0.4f);
        if(average>=50 && score2 >=50){
            System.out.println("congrats");
        }else {
            System.out.println("sorry");
        }

         */

        System.out.println("how many");
        int sizeOfNum = scanner.nextInt();
        int[] nums = new int[sizeOfNum];

        for( int i = 0; i < nums.length; i++){
            System.out.println("num:");
            nums[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        for( int i = 0; i < nums.length; i++){
            if(nums[i]%2 ==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }


    }
}
