import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5);
        account1.withdraw(2000);
        account1.deposit(2500);
        System.out.printf("Balance is: %.2f %n Monthly Interest is " + "%.2f%n Date Created is %s"
                , account1.getBalance()
                , account1.getMonthlyInterest()
                ,account1.getDateCreated());



    }
}
