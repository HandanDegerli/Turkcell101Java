package java101;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {

        /*
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 30;
        numbers[4] = 40;
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array lenght: ");
        int lenght = scanner.nextInt();
        int[] numbers = new int[lenght];
        for (int i = 0; i <numbers.length; i++){
            System.out.println((i+1) + ". Number:");
            numbers[i] =scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


        int total = 0;
        for (int i = 0; i <numbers.length; i++){
            total = total + numbers[i];
        }
        System.out.println(total/ numbers.length);

    }
}
