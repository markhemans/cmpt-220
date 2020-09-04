
import java.util.Scanner;

/**
 *
 * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (3.2)
 */
public class Prob_3_2 
{
    public static void main(String[] args)
    {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 3 % 10);
  
        Scanner input = new Scanner(System.in);
        int answer = number1 + number2 + number3;
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
        int number = input.nextInt();
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + number + " is " + (number1 + number2 + number3 == number));
    }
}
