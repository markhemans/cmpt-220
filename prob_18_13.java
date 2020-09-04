import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (18.13)
 */

public class prob_18_13 {
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbersList = new int[8];
    System.out.println("Enter 8 integers: ");

        for (int i = 0; i < numbersList.length; i++)
        {
            numbersList[i] = input.nextInt();
        }
        System.out.println("The largest number is " + getLargest(numbersList));
    }

   

    private static int getLargest(int[] numbersList, int i, int largest) {

        if (i == numbersList.length)
        {
            return largest;
        }
        else if (largest < numbersList[i])
        {
            largest = numbersList[i];
        }
        
        return getLargest(numbersList,i+1,largest);
    }
    
    private static int getLargest(int[] numbersList)
    {
        return getLargest(numbersList, 0, numbersList[0]);
    }
}
