package java101;

import java.util.Scanner;

public class ConditionalStatements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score:");
        int score = scanner.nextInt();

        if(score >= 85 && score <=100){
            System.out.println("Excellence");
        } else if (score >= 70 && score <85) {
            System.out.println("Good");
        }else if (score >= 55 && score <70){
            System.out.println("Passed");
        } else if (score >= 45 && score <55) {
            System.out.println("Conditional Passed");
        } else if (score >= 0 && score <45) {
            System.out.println("Not Passed");
        }else {
            System.out.println("type the number between 0 & 100 please");
        }
        }
    }

