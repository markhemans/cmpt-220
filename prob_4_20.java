
import java.util.Scanner;

/**
 *
 * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (4.20)
 */
public class prob_4_20 
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Word: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("The length of the word is: " + name.length());
        System.out.println("The first character is: " + name.charAt(0));
    }
}
