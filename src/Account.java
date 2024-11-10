import java.util.Date;

public class Account {
    private int id;
    double balance;
    private static double annualInterestRate;
    private Date dateCreated=new Date();

    public Account() {this(0,0);}

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
        dateCreated=new Date();
    }

    public static void setAnnualInterestRate(double rate)
    {
        annualInterestRate = rate;
    }

    public static double getAnnualInterestRate(){return annualInterestRate;}
    public int getId(){return id;}
    public double getBalance(){return balance;}
    public Date getDateCreated(){return dateCreated;}
    public double getMonthlyInterestRate(){return getAnnualInterestRate()/12;}
    public double getMonthlyInterest(){return balance*getMonthlyInterestRate()/100;}

    public boolean withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    public boolean deposit(double amount){
        if(amount > 0){
            balance += amount;
            return true;
        }else
            return false;
    }
}
