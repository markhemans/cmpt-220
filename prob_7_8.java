
import java.util.Scanner;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (7.8)
 */
public class prob_7_8 {
    public static void main (String[] args)
    {
    System.out.println("Enter Values: ");
    double[] array1 = new double[10];
    int[] array2 = new int[10];
    Scanner input = new Scanner(System.in);
    for (int i=0;i<10 ;i++)
           {
    	   array2[i] = input.nextInt();
           array1[i] = array2[i];
           }
 System.out.println("Average of double[] array = " + average(array1));
 System.out.println("Average of int[] array = " + average(array2));
    }
    
    
public static int average(int[] array)
{
    int sum=0;
    int average;
    int count =0;
    for (int i=0;i<10 ;i++)
           {
    	   sum =  sum + array[i];
           count++;
           }
    average = sum / count;
    return average;
}

public static double average(double[] array)
{
   double sum=0;
    double average;
    int count =0;
    for (int i=0;i<10 ;i++)
           {
    	   sum =  sum + array[i];
           count++;
           }
    average = sum / count;
    return average; 
}

}
