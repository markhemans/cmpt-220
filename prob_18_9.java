import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (18.9)
 */
public class prob_18_9 {
      public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        reverseDisplay(word);
    }

    private static void reverseDisplay(String word) {
        if (word.length() == 0)
        {
            return;
        }
        System.out.print(word.substring(word.length() - 1));
        reverseDisplay(word.substring(0, word.length()-1));
    }
    
}
