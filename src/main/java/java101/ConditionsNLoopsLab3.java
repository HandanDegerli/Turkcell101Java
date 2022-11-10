package java101;

import java.util.Scanner;

public class ConditionsNLoopsLab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("type a text");
        String text = scanner.nextLine();

        for(int i = text.length()-1; i >=0; i--){
            System.out.println(text.charAt(i));
        }

         */

        System.out.println("num:");
        int num = scanner.nextInt();

        int result = num;
        for(int i =num; i>0;i--){
            result =result*i;
        }
    }
}
