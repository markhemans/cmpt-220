import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (18.17)
 */
public class prob_18_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of characters: ");
        String s = input.nextLine();
        System.out.print("Enter a single character: ");
        char ch = input.next().charAt(0);
        char[] chars = s.replaceAll(" ", "").toCharArray();
        System.out.println("The occurrences of '" + ch + "' in \"" + s + "\" = " + count(chars, ch));
    }

   

    private static int count(char[] chars, char ch, int high) {

        int count = (chars[high] == ch) ? 1 : 0;

        if (high == 0)
        {
            return count;
        }
        else
        {
            return count + count(chars, ch, high - 1);
        }
    }
    
    private static int count(char[] chars, char ch)
    {
        return count(chars, ch, chars.length - 1);
    }
    
}
