package java101;

import java.util.Scanner;

public class WhileLab {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       /*  int starCount = scanner.nextInt();
        int i = 0;
        while(i <= starCount){
            int j = 0;
            while(j < i) {
                System.out.println("*");
                j++;
            }
            System.out.println();
            i++;
        }

        */

        long total =0;
        while(true){
            int x = scanner.nextInt();
            if (x == 0){
                break;
            }
            total += x;
        }
        System.out.println(total);
    }
}
