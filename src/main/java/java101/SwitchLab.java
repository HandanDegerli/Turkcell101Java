package java101;

import java.util.Scanner;

public class SwitchLab {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("num1:");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("num2:");
        float y = Float.parseFloat(scanner.nextLine());
        System.out.println("operation:");
        char operation = scanner.nextLine().charAt(0);

        System.out.println(x);
        System.out.println(y);
        System.out.println(operation);


        switch (operation){
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            default:
                System.out.println("unknown operator");
                break;
        }

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("day:");
        int day = scanner.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("wrong entry");
                break;
        }

    }
}
