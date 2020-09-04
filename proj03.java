
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class proj03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double sub = input.nextDouble();
        double grat = input.nextDouble();
        double first = ((sub/100)*grat);
        double second = first + sub;
        System.out.println("The gratuity is $" + first + " and the total is $" + second);
    }
}
