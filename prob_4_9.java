
import java.util.Scanner;

/**
 *
 * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (4.9)
 */
public class prob_4_9 
{
    public static void main(String[] args)
    {
        System.out.print("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char i = input.next().charAt(0);
        int unicode = (int)i;
        System.out.println("The Unicode for the character " + i + " is " +unicode);
    }
}
