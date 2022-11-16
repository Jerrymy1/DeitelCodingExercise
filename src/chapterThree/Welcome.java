package chapterThree;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Native myAccount = new Native();
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Enter name");
        String theName = input . nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in myAccount is:%n%s%n", myAccount.getName());
    }
}
