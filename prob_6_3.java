
import java.util.Scanner;


/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (6.3)
 */
public class prob_6_3 {
    
    
    public static void main(String[] args) {
        
        
       Scanner input = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int number = input.nextInt();
       
       if(isPalindrome(number))
        {
            System.out.println(number + " is a palindrome");
        }
        else
        {
            System.out.println(number + " is not a palindrome");
        
        }
    }
  
public static int reverse (int number1)
    {
      int palindrome = number1;
      int reverse = 0;
       while (palindrome != 0) 
       {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return reverse;
    }

    public static boolean isPalindrome (int numero)
    {
         
        if (reverse(numero) == numero)
           {
   
            return true;
        }
        else return false;
        
        
      
        
    }  
        

    }
    

