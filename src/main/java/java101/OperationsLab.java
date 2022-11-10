package java101;

import java.util.Scanner;

public class OperationsLab {
    public static void main(String[] args) {
        //relational op.
        boolean result = 9 != 5;
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(str1.equals(str2));

        System.out.println("---------------------");
        //Logical op.

        boolean x = false;
        boolean y = true;

        System.out.println(x && y);
        System.out.println(x || y);

        System.out.println(!x && y);

        System.out.println("---------------------");
        //Conditional op.

        int a = 10;
        int b = 20;


        if(a<b){
            System.out.println("b is bigger than a");
        }else{
            System.out.println("b is lower than a");
        }

        System.out.println( a > b ? "a b'den büyüktür" : "a b den küçüktür");

        Scanner scanner1 = new Scanner(System.in);
        int z = scanner1.nextInt();
        System.out.println( a>z ? "a z'den büyüktür" : "a z den küçüktür");



    }
}
