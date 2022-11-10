package java101;

import java.util.Scanner;

public class ConditionOperations {
    public static void main(String[] args) {
        //Ternary if operator

        Scanner scanner = new Scanner(System.in);
        System.out.println("Age:");
        int age = scanner.nextInt();
        System.out.println(age>=18? "you can get driver licence!" : "sorry you can not take DL!");
    }
}
