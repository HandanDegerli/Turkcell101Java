package java101;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
       /* int number = -10;


        if (number > 0){
            System.out.println("number is a positive number");
        }else {
            System.out.println("number is a negative number");
        }
        System.out.println("burası her zaman calıscak");

        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("num1: ");
        int number = scanner.nextInt();
        if (number%2 == 0){
            System.out.println("number is a even number");
        }else {
            System.out.println("number is a odd number");
        }

         */

        /*
        int num = 40;

        if (num <100){
            System.out.println("lower than 100");
            if (num >50){
                System.out.println("bigger than 50");
            }
        }

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("num: ");
        int num = scanner.nextInt();
        if (num <100 && num >=10){
            System.out.println("sayı iki basamaklı");
        }else if (num <1000 && num>=100){
            System.out.println("sayı 3 basamaklı");
        }


    }
}
