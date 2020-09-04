import java.util.Scanner;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (7.4)
 */
public class prob_7_4 {
    public static void main (String[] args)
    {
    System.out.println("Enter Values: ");
    int[] scores = new int[100];
    Scanner input = new Scanner(System.in);
    int sum=0;
    int count = 0;
    
       
        
           for (int i=0;i<=100 ;i++)
           {
    	   scores[i] = input.nextInt();
           if (scores[i] < 0)
           {
            break;
           }
           
    	   sum = sum + scores[i];
           count++;
           
        }
    
       int average = sum / count;
       int aboveCount=0;
       int equalCount=0;
       
       for (int i = 0; i <= count; i++) 
       {
    	   if (scores[i] > average) 
           {
    		   aboveCount++;
           }
       }
       
       for (int i = 0; i <= count; i++) 
       {
    	   if (scores[i] == average) 
           {
    		   equalCount++;
           }
       }
       
       System.out.println("Average is " + average);
       System.out.println("Number of elements above the average is " + aboveCount);
       System.out.println("Number of elements equal to the average is " + equalCount);
       System.out.println("Number of elements below the average is " + ((count-aboveCount)-equalCount));
       
}
}
