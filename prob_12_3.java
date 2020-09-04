import java.util.Scanner;

public class prob_12_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] randomNumbers = new int[100];
        
        for (int i = 0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = (int) (Math.random() * 100);
        }
        
        System.out.print("Enter an index: ");
        int index = input.nextInt();
        try
        {
            System.out.println("Index " +index + " finds the follwing random number: " + randomNumbers[index]);
        }
        
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("Out of bounds");
        } 
    
    
    }
}
