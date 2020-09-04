import java.util.Date;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (9.7)
 */
public class Account {
    
public static void main(String[] args) {
Account account = new Account(1122, 20000, 4.5);
java.util.Date dateCreated = new java.util.Date();
account.withdraw(2500);
account.deposit(3000);
System.out.println("Balance: " + account.getBalance());
System.out.println("Monthly Interest: " + account.getMonthlyInterestRate()*account.getBalance());
System.out.println("Date Created: " + dateCreated);
}   

 private int id;
 public double balance;
 private double annualInterestRate;
 private Date dateCreated;





Account(int newId, double newBalance, double newAnnualInterestRate)
{
    id = newId;
    balance = newBalance;
    annualInterestRate = newAnnualInterestRate;
}


double withdraw(double amount)
{
    return balance -= amount;
}   

double deposit(double amount)
{
    return balance += amount;   
}



public int getId()
{
    return id;
}

public double getBalance()
{
    return balance;
}

public double getAnnualInterestRate()
{
    return annualInterestRate;
}


double getMonthlyInterestRate()
{
    return (annualInterestRate/100)/12;
}


}

    

