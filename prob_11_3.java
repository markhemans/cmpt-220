

public class prob_11_3 {

    public static void main(String[] args) {

        Account account = new Account(111, 200,0);
        Checkings checkings = new Checkings(112, 250);
        Savings savings = new Savings(113, 250);
        System.out.println("Before 260 deduction.");
        System.out.println(checkings);
        System.out.println(savings);
        checkings.withdraw(260);
        savings.withdraw(260);
        System.out.println(account);
        System.out.println("After 260 deduction.");
        System.out.println(checkings);
        System.out.println(savings);
    }

}