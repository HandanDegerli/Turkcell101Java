package java101;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {
/*
        int[] numbers;
        numbers = new int[16];
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[5]);
        numbers[5] =32;
        System.out.println(numbers[5]);

 */
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(numbers[5]);
        System.out.println(numbers.length);

        String[] names = new String[10];
        System.out.println(names);

        names[2] = "Ali";
        names[5] = "Hasan";
        System.out.println(Arrays.toString(names));
        names[14] = "Ozi";
    }
}
