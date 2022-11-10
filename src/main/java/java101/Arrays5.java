package java101;

import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[] numbers ={20, 32, 12, 46, 4};
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 12));

        int[] copyOf = Arrays.copyOf(numbers, 10);
        System.out.println(Arrays.toString(copyOf));
        int[] copyOfRange = Arrays.copyOfRange(numbers, 2, 4);
        System.out.println(Arrays.toString(copyOfRange));

        //Arrays.fill(numbers, 44);
        //System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
