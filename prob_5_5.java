
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (5.5)
 */
public class prob_5_5
{
   public static void main(String[] args)
    {
       DecimalFormat df = new DecimalFormat(".#");
       DecimalFormat df2 = new DecimalFormat(".##");
       System.out.print("Kilograms");
       System.out.print("Pounds");
       System.out.print("Pounds");
       System.out.print("Kilograms");
       System.out.println();
      int k=20;
      
       while (k<=515)
            {
       for (int i=1; i<=199; i+=2)
        {
            
                    
           System.out.printf("%5s",i);
           System.out.printf("%10s",df.format(i*2.2) + "  |");  
           System.out.printf("%5s",k);
           System.out.printf("%10s",df2.format(k/2.2));
            System.out.println();
            k= k+ 5;
                }
        }
        }
        }
        
    



