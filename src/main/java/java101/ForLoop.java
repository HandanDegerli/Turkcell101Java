package java101;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
       /* for (int i = 0; i <10; i++){
            System.out.println(i);
        }
        for (int i = 9; i >= 0; i--){
            System.out.println(i);
        }
        int[] nums ={2, 4, 6, 8, 10, 12};
        for (int i =0; i <nums.length; i++){
            System.out.println(nums[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("num:");
        int x = scanner.nextInt();
        System.out.println("num:");
        int y = scanner.nextInt();

        for(int i = x; i <=y; i++){
            System.out.println(i);
        }

        */

        String[] names;
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many");
        names = new String[Integer.parseInt(scanner.nextLine())];

        for (int i = 0; i < names.length; i++){
            System.out.println(i+1);
            names[i] = scanner.nextLine();
        }

        for (int i = 0 ; i < names.length; i++){
            System.out.println(names[i]);
        }


    }
}
