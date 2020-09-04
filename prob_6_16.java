import java.util.Scanner;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (6.16)
 */

public class prob_6_16{
    
    public static void main (String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the year you want to calculate: ");
       int ask = input.nextInt();
       System.out.println("The year " + ask + " had " + numberOfDaysInAYear(ask) + " days.");
    }
    
    public static int numberOfDaysInAYear(int year)
    {
        int days;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            days = 366;
        }
        else
        {
            days = 365;
        }
        return days;
    }

}
