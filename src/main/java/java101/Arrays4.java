package java101;

import java.util.Arrays;

public class Arrays4 {

    public static void main(String[] args) {
        /*
        int total=0;
        int[] numbers = {1, 5, -5, 9, 2, 8, 9};
        for (int i = 0; i <numbers.length; i++){
            total = total + numbers[i];
        }
        System.out.println(total);


        int total=0;
        int[] numbers = {1, 5, -5, 9, 2, 8, 9};
        int[] numbers2 = new int[numbers.length];

        for (int i = 0; i <numbers.length; i++){
            numbers2[i] = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

         */

        String[] names = new String[3];
        names[0] = "Ali";
        names[1] = "Veli";
        names[2] = "Can";

        System.out.println(Arrays.toString(names));
        for (int i = names.length-1; i >= 0; i--){
            System.out.println(names[i]);
        }

        int[] numbers1 = {1, 2, 3};
        System.out.println(Arrays.toString(numbers1));
        int[] numbers2 = numbers1;
        System.out.println(Arrays.toString(numbers2));
        numbers1[0] = 5;
        System.out.println(Arrays.toString(numbers2));


    }
}
