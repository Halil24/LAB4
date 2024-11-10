import java.util.Scanner;

public class ATMmachine {
    private static Scanner in=new Scanner(System.in);

    public static void main(String[]args)
    {
        final int NRACCOUNTS=10;
        Account[] accountATM=new Account[NRACCOUNTS];

        for (int i = 0; i<10; i++){
            accountATM[i]=new Account(i,100);
        }
while(true) {
    System.out.println("Enter Account ID: ");
    int accountID = in.nextInt();
    int option;
        do {
            showMenu();
            System.out.println("Enter a choice: ");
option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Balance is: " + accountATM[accountID].getBalance()+"\n");
                    break;
                case 2:
                    withdrawMoney(accountATM[accountID]);
                    break;
                case 3:
                    depositMoney(accountATM[accountID]);
                    break;
                case 4:
                    System.out.println("Exiting from account with ID: " + accountID);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(option!=4);

}
    }

    public static void showMenu(){

        System.out.println("Main menu");
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");

    }

    public static void withdrawMoney(Account account){
        System.out.printf("Enter amount to withdraw:");
        double amount=in.nextDouble();
        boolean withdrawn=account.withdraw(amount);
        if(withdrawn){
            System.out.printf("Withdraw was successful\n");
        } else{
            System.out.printf("Withdraw was not successful\n");

        }
    }

    public static void depositMoney(Account account){
        System.out.printf("Enter amount to deposit:");
        double amount=in.nextDouble();
        boolean deposited =account.deposit(amount);
        if(deposited){
            System.out.printf("Deposit was successful\n");
        } else{
            System.out.printf("Deposit was not successful\n");

        }
    }

}
