package java101;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i:nums){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("give us 10 nums");
        for (int i =0; i <nums.length; i++){
            nums[i] = scanner.nextInt();
        }

        for (int i : nums){
            if(i%2==1) {
                System.out.println(i);
            }
            if (i == 5) {
                break;
            }
            }
        }
    }

