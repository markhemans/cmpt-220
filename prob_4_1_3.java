
import java.util.Scanner;

/**
 *
 * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (4.13)
 */
public class prob_4_1_3 
{
    public static void main(String[] args)
    {
        System.out.print("Enter a letter: ");
        Scanner input = new Scanner(System.in);
        char i = input.next().charAt(0);
        int unicode = (int)i;
        if (unicode==97 || unicode ==65 || unicode == 101 || unicode ==69 || unicode == 105 || unicode ==79 || unicode == 111 || unicode ==117 || unicode == 85 )
        {
            System.out.println(i + " is a vowel");
        }
        else if (Character.isLetter(i))
        {
            System.out.println(i + " is a consonant");
        }
         else 
        {
            System.out.println(i + " is an invalid input");
        }
        
    }
}
