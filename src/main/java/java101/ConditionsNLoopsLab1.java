package java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConditionsNLoopsLab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int total =0;
        int input = 0;
        do{
            System.out.println("num");
            input = scanner.nextInt();
            total += input;
        }while (input !=0);
        System.out.println("total: " + total);



        String password = "";
        do{
            System.out.println("passsword:");
            password = scanner.nextLine();
        }while(!password.equals("1234"));

        */

        Random random = new Random();
        System.out.println("how many");
        int num = scanner.nextInt();
        int[] nums = new int[num];

        float total = 0.0f;
        for(int i = 0; i < nums.length; i++){
            nums[i]= random.nextInt(100);
        }
        //System.out.println(Arrays.toString(nums));

        System.out.println("average:");
        float average = total/num;
        System.out.println(average);
    }

}
