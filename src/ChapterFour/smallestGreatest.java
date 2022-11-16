package ChapterFour;

import java.util.Scanner;

public class smallestGreatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = input.nextInt();


        int largestNumber = number;
        int smallestNumber = number;

        while (number != 0) {

            if (smallestNumber < number) {
                smallestNumber = number;
            }

            if (largestNumber > number) {
                largestNumber = number;
            }

            System.out.println("Enter a Number and press 0 to stop");
            number = input.nextInt();
        }
        System.out.printf("Number is smallest %d%n: " , smallestNumber);
        System.out.printf("Number  is largest %d%n ", largestNumber);



    }
}
