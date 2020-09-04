import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (7.14)
 */
public class prob_7_14 {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
    System.out.println("Enter five numbers: ");
    for (int i = 0; i<numbers.length; i++)
    {
        numbers[i] = input.nextInt();
        if (numbers[i] == 0)
        {
            System.out.println("The GCD is: 0");
        }
       
    }
    System.out.println("The GCD is: "+gcd(numbers));
    }
    
    public static int gcd(int... numbers)
    {
    int min = numbers[0];
    for (int foundmin: numbers)
    {
        if (foundmin < min)
        min = foundmin;
    }
                
    int gcd = 1;		
    boolean canDivide;

    for (int i = 2; i < min; i++)
    {
	canDivide = true;
        for (int j: numbers)
        {
            
            if (j % i != 0)
            {
            canDivide = false;
            }
	}
            if (canDivide == true)
            {
            gcd = i;
            }
            
    }
                
    return gcd; 
}
}
