
import java.util.Scanner;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (5.16)
 */
public class prob_5_1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        for (int i=2; i<=number;i++)
        {
            while (number%i == 0)
            {
                number=number/i;
                if (number%i != number)
                {
                    System.out.print(i+ ",");
                }
                else
                {
                    System.out.println(i+ ".");
                }
            }
        }

    }
}
