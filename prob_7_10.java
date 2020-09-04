import java.util.Scanner;


/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (7.10)
 */
public class prob_7_10 {
    public static void main(String[] args)
    {
       double numbers[] = new double[10]; 
       Scanner input = new Scanner(System.in);
       System.out.println("Enter ten integers");
       for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
        }
       System.out.println("The index of the smallest value is: " +indexOfSmallestElement(numbers));
    }
    
    public static int indexOfSmallestElement(double[] array)
    {
      double number = array[0]; 
      int smallestindex = 0;
		for (int i=1; i < array.length; i++)
                {
                    
                if (array[i] < number)
                      {
                      if (array[i] == number)
                    {
                        continue;
                    }
                      
                      
                        number = array[i];
                        smallestindex = i;
                        }
                }
        return smallestindex;
    }
}

