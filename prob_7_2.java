import java.util.Scanner;

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (7.2)
 */
public class prob_7_2{
    public static void main(String[] args) {
	   int[] firstList = new int[10];
    	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter ten values: ");
           for (int i = 0; i<firstList.length; i++) 
           {
		   firstList[i] = input.nextInt();
           }
           System.out.print("Before: ");
           for (int i = 0; i<firstList.length; i++) 
           {
		   System.out.print(firstList[i]);
           }
           System.out.println();
            System.out.print("After: ");
           for (int i = firstList.length-1; i>=0; i--) 
           {
		   System.out.print(firstList[i]);
           }
           System.out.println();
}
    
}
