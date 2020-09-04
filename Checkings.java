


public class Checkings extends Account
{

    double overdraftLimit = -25;

    public Checkings(int id, double balance)
    {
        super(id, balance,0);
    }

    @Override
    public double withdraw(double amount) {
        if (balance - amount >= overdraftLimit)
        {
            return super.withdraw(amount);
        }
        return amount;
    }

    @Override
    public String toString() {
        return "Checking Account Balance: {"+balance+'}';
    }
}