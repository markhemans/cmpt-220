import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (18.7)
 */
public class prob_18_7 {
    static int count;

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
       
        int index = input.nextInt();

        System.out.println("Fibonacci number at index " + index + " is " + fib(index));

        System.out.println("The fib method was called " + count + " times");
    }

    public static long fib(long index) {
        count++;
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else  
            return fib(index - 1) + fib(index - 2);
    }
}
