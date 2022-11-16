package tdd;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        //given
        Account deborahAccount = new Account();
        // when i deposit 5000
        deborahAccount.deposit(5000);

        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();

        assertEquals(5000, deborahAccountBalance);

    }

    @Test
    public void depositTwiceTest(){
        // given there is an account
        Account deborahAccount = new Account();
        // given that initial balance is 4000
        deborahAccount.deposit(4000);
        // when i deposit 2000
        deborahAccount.deposit(2000);

        // check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(6000, deborahAccountBalance);
    }


    @Test
    public void depositNegativeAmountTest(){
            // given there is an account
            Account deborahAccount = new Account();
            // given that initial balance is 4000
            deborahAccount.deposit(4000);
            // when i deposit 2000
            deborahAccount.deposit(-2000);

            // check that balance is 6000
            int deborahAccountBalance = deborahAccount.getBalance();
            assertEquals(4000, deborahAccountBalance);
        }

       @Test
        public void withdrawLowerAmountTest() {
            //given there is an account
           Account account = new Account();
           // given that initial balance is 2000
           account.deposit(8000);
           //when i withdraw 200
           account.withdraw(200);


           //check that balance is 7800
           int accountBalance = account.getBalance();
           assertEquals(7800, accountBalance);
       }

       @Test
    public void withdrawExactBalanceTest(){
           //given there is an account
           Account account = new Account();
           // given that initial balance is 2000
           account.deposit(2000);
           //when i withdraw 2000
           account.withdraw(2000);

           //check that balance is 0
           int accountBalance = account.getBalance();
           assertEquals(0, accountBalance);
       }

    @Test
    public void withdrawNegativeBalanceTest(){
        //given there is an account
        Account account = new Account();
        // given that initial balance is 3000
        account.deposit(3000);
        //when i withdraw 5000
        account.withdraw(5000);

        //check that balance is 3000
        int accountBalance = account.getBalance();
        assertEquals(3000, accountBalance);

    }
}
