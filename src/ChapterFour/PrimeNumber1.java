package ChapterFour;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = number.nextInt();
        //int num = 100;
        int count = 0;
        for(int i = 2; i <= num; i++){

            if (num % 1 == 0){
               // count ++;
            }


            if (count == 2) {
                System.out.print("Not Prime");
            }
         else {
                System.out.print(num + " is a Prime");
            }


            }
    }
}
