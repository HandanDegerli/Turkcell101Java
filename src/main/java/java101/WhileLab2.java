package java101;

import java.util.Scanner;

public class WhileLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int x = 0;
        int y = 100;
        while (x<y){
            if(x%2==0){
                System.out.println(x);
            }
            x++;
        }
        int x = 0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(x < 10){
            int input = scanner.nextInt();
            if(input < min) min = input;
            if (input > max) max = input;
            x++;
        }

        System.out.println(min);
        System.out.println(max);

        

        float average = 0.0f;
        int count = 0;
        while(true){
            int number = scanner.nextInt();
            if (number==0) break;
            count++;
            average += number;
        }
        System.out.println(average/count);
        
        */
        
        int positiveCount =0;
        int negativeCount =0;
        
        while(true){
            int x = scanner.nextInt();
            if(x==0)
                break;
            if(x>0){
                positiveCount++;
                
            } else if (x < 0 ) {
                positiveCount--;
                
            }else {
                break;
            }

        }
        System.out.println(positiveCount);
        System.out.println(negativeCount);
        

    }
}
