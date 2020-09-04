import java.util.Scanner;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (6.12)
 */
public class prob_6_12 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first character: ");
        char a = input.next().charAt(0);
        System.out.println("Enter the second character: ");
        char b = input.next().charAt(0);
        System.out.println("Enter how many characters per line: ");
        int c = input.nextInt();
        System.out.println();
        System.out.println("Below are the characters with " + c + " chars per line: ");
        printChars(a,b,c);
        
    }
    
    public static void printChars(char ch1, char ch2, int numberPerLine)
    {
       int space = (int)(ch2-ch1);
       for (int i=0;i<space;i++)
       {
           if (i%numberPerLine==0)
        {
            System.out.println();
        }
           
           System.out.print(ch1++ + " ");
       
       if (ch1==ch2)
       {
           break;
       }
        
       }
       System.out.println();
    }
    
}
