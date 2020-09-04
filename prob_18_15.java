import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (18.15)
 */
public class prob_18_15 {
     public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        System.out.println("The number of occurences of " + ch + " is: " +count(word, ch));

    }
    
     
    public static int count(String str, char ch, int high)
    {
        int n = (ch == str.charAt(0)) ? 1 : 0;
        if (high <= 0)
        {
            return n;
        }
        else
        {
        return n + count(str.substring(1), ch, high-1);
        }
    }
      
    public static int count(String s, char ch)
    {
        return count(s, ch, s.length() - 1);
    }
}
