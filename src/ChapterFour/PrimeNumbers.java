package ChapterFour;

import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getPrimeNumber (int num){
        for(int i=2; i<=num; i++){
            if (isPrimeNumber(i))
                System.out.print(i + " ");
        }
    }




    public static void main(String[] args) {
        System.out.println("10 is prime number: " + isPrimeNumber (10));
        System.out.println("2 is prime number: " + isPrimeNumber (2));
        System.out.println("0 is prime number: " + isPrimeNumber (0));
        System.out.println("100 is prime number: " + isPrimeNumber (100));



        getPrimeNumber(7);
        getPrimeNumber(100);
    }







}
