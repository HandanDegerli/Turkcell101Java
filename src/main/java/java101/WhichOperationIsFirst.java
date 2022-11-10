package java101;

import java.util.Scanner;

public class WhichOperationIsFirst {
    public static void main(String[] args) {
  /*      int x = 11 + 3 * 2;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);

        System.out.println(--x);
        System.out.println(x);
        System.out.println(5%2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("number: ");
        int a = scanner.nextInt();
        System.out.println(a%2 ==0 ? "even number" : "odd number");


   */
        Scanner scanner = new Scanner(System.in);
        System.out.println("password: ");
        String password = scanner.nextLine();
        boolean isOk = password.equals("1234");
        System.out.println(isOk ? "congrats" : "wrong password");



    }
}
