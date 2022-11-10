package java101;

import java.util.Scanner;

public class ConditionsNLoopsLab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("yaricap:");
        int yaricap = scanner.nextInt();

        float alan = (float)(Math.PI*Math.pow(yaricap,2));
        float cevre = (float)(2*Math.PI*yaricap);

         */
        System.out.println("bir kenar uzunluğu:");
        int x= scanner.nextInt();

        int alan = (int)Math.pow(x, 2);
        int cevre = x*4;

    }
}
