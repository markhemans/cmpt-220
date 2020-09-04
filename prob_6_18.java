import java.util.Scanner;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (6.18)
 */

public class prob_6_18{
    
    public static void main (String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your password: ");
       String password = input.nextLine();
       if (validPassword(password) == true)
       {
           System.out.println("Valid Password");
       }
       else
       {
           System.out.println("Invalid Password");
       }    
    }
    
    public static boolean validPassword(String pword)
    {
        if (pword.length()<8)
        {
     return false;   
        }
        else
        {
           char a;
           int numberOfDigits=0;
           for (int i = 0; i < pword.length(); i++)
           {
             a = pword.charAt(i);  
             if (!Character.isLetterOrDigit(a))
            {          
               return false;  
            }
             else if (Character.isDigit(a))
             {  
                numberOfDigits++;     
             }
           }
           
           
           
           if (numberOfDigits < 2)
           {     
            return false;  
           }  
         
        }
    return true;
}
}       


