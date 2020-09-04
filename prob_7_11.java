import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (7.11)
 */
public class prob_7_11 {
    public static void main(String[] args)
    {
       DecimalFormat df = new DecimalFormat(".#####"); 
       DecimalFormat df2 = new DecimalFormat(".##");
       double numbers[] = new double[10]; 
       Scanner input = new Scanner(System.in);
       System.out.println("Enter ten integers");
       for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
        }
       System.out.println("The mean is: " + df2.format(mean(numbers)));
       System.out.println("The standard deviation is: " +df.format(deviation(numbers)));
    }
    
    
    public static double deviation(double[] x)
    {
    double deviationvalue = 0;
    double newarray[] = new double[10];    
    for(int i = 0; i < x.length; i++)
    {
        newarray[i] = x[i] - mean(x);
    }
    for (int j=0; j< x.length; j++)
    {
        deviationvalue = deviationvalue + (newarray[j] * newarray[j])/9;
    }
     return Math.sqrt(deviationvalue);
    }
    
    
    public static double mean(double[] x)
    {
    double sum = 0;
    for (int i = 0; i < x.length; i++)
    {
        sum += x[i];
    }
    double meanvalue = sum / x.length;
    return meanvalue;  
    }
    
}
