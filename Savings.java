public class Savings extends Account
{

    double overdraftLimit = 0;

    public Savings(int id, double balance)
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
        return "Saving Account Balance: {"+balance+'}';
    }
}