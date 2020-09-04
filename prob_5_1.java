
import java.util.Scanner;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (5.1)
 */
public class prob_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        double sum = 0;
        int positivenumbers=0;
        int negativenumbers=0;
        double average=0;
        int count=0;
        if (number == 0)
        {
        System.out.println("No numbers are entered except 0");
        System.exit(0);
        }
        
        while (number!=0)
        {
        
            if (number>0)
            {
                positivenumbers++;
            }
            else
            {
                negativenumbers++;
            }    
        count++;   
        sum = sum + number;
        average = sum/count; 
        number = input.nextInt();
        
        } 
        
        System.out.println("The number of positives is: " +positivenumbers);
        System.out.println("The number of negatives is: " +negativenumbers);
        System.out.println("The total is: " +sum);
        System.out.println("The average is: " +average);

    }
}
