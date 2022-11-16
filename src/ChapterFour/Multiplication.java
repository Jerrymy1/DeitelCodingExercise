package ChapterFour;


import java.util.Scanner;

public class Multiplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num = input.nextInt();
        for (int i=1; i<13; i++ ){
            System.out.println(num  +  " times " +i+ " is "  + num * i);
        }
    }
}
