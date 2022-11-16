package tdd;


import java.util.Scanner;

public class AccountThreeTest {
    public static void main(String[] args) {

        String name ="jerrymy";
        AccountThree savingsAccount = new AccountThree(name,1000);
        AccountThree currentAccount = new AccountThree(name, 2000);

        System.out.printf("%s savings balance: $ %n",
                savingsAccount.getName(), savingsAccount.getBalance() );
        System.out.printf("%s current balance: $ %n",
                currentAccount.getName(), currentAccount.getBalance() );

        Scanner input = new Scanner(System.in);

        System.out.print(" deposit amount"  );
        double depositAmount = input.nextDouble();
        System.out.printf("%n  to savings account:" , depositAmount);
        savingsAccount.deposit(depositAmount);

        System.out.print(" deposit amount"  );
         depositAmount = input.nextDouble();
        System.out.printf("%n  to current account:" , depositAmount);
        currentAccount.deposit(depositAmount);

        System.out.printf("%n savings balance is:  "  +  savingsAccount.getBalance());
        System.out.printf("%n current balance is:  "  +  currentAccount.getBalance());

    }
}
