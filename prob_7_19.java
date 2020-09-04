import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (7.19)
 */
public class prob_7_19
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("How many values...");
    int size = input.nextInt();
    int[] numbers = new int[size];
    System.out.println("Enter a list: ");
    for (int i = 0; i<numbers.length; i++)
    {
        numbers[i] = input.nextInt();
    }
    if (isSorted(numbers) == true)
    {
    System.out.println("The list is already sorted");
    }
    else
    {
    System.out.println("The list is not sorted");    
    }
    }
    
    public static boolean isSorted(int[] list)
    {
      for(int i = 1; i < list.length; i++)
    {
        if(list[i-1] > list[i])
        {
            return false;
        }
    }
    return true;
    }
}
