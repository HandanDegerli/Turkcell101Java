package java101;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println(i++);
        }while(i <10);

        String password = null;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Password: ");
            password = scanner.nextLine();
        }while (!password.equals("123"));

        System.out.println("welcome");
    }
}
