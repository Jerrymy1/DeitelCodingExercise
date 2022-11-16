package tdd;

import static jdk.internal.org.jline.utils.Colors.s;

public class AccountTwoTest {
    public static void main(String [] args){
        AccountTwo account1 = new AccountTwo("Jerrymy");
        AccountTwo account2 = new AccountTwo("Murphy");

        System.out.printf("account1 name is:  %s%n", account1.getName());
        System.out.printf("account2 name is:  %s%n", account2.getName());


    }
}
