import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (18.11)
 */

public class prob_18_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextLong();
        System.out.println(sumDigits(n));
    }

    public static long sumDigits(long n) {

        if (n == 0)
        {
            return n;
        }
        else
        {
        return n % 10 + sumDigits(n/10);
        }
    }  
}
