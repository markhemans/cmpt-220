import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (10.5)
 */

public class prob_10_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = input.nextInt();

        StackOfIntegers primes = new StackOfIntegers();

        int factor = 2;
        while (factor <= userNumber)
        {
            if (userNumber%factor==0)
            {
                primes.push(factor);
                userNumber = userNumber/factor;
            }
            else
            {
                factor++;
            }
        }
        
        System.out.println("Below are the prime factors in decreasing order: ");
        while (!primes.empty())
        {
           
            System.out.print(primes.pop() + ", ");
            
        }
System.out.println("");

    }
}
