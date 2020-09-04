import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (6.9)
 */
public class prob_6_9 {
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat(".###");
        double k = 20.0;
        System.out.printf("%5s","Feet");
        System.out.printf("%10s","Meters");
        System.out.printf("%16s","Meters");
        System.out.printf("%10s","Feet");
        System.out.println();
        while (k <=65)
        {
        for (double i=1;i<11;i++)
        {
            System.out.printf("%5s",i);
            System.out.printf("%10s",footToMeter(i));
            System.out.printf("%6s","|");
            System.out.printf("%10s",k);
            System.out.printf("%10s", meterToFoot(k));
            System.out.println();
            k=k+5;
        }
        }
        
    }
    public static double footToMeter(double foot)
    {
     double result;
     result = 0.305 * foot;
     return result;
    }
    
    public static double meterToFoot(double meter)
    {
     double result;
     result = 3.279 * meter;
     return result;
    }
}