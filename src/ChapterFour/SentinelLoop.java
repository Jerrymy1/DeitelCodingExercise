package ChapterFour;

import java.util.Random;
import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println("Random number is " + randomNumber);


        while (true) {
            System.out.println("Enter ur guessed number (1 - 100) ");

            Scanner input = new Scanner(System.in);
            int guessBuddy = input.nextInt();

            if (guessBuddy == randomNumber) {
                System.out.println("Correct You guest it right!!");
                break;
            } else if (guessBuddy > randomNumber) {
                System.out.println("Number too large. Guess again");
            } else {
                System.out.println("Ooops Number too low. Common really");
            }
        }


    }
}
