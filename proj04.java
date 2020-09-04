
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
public class proj04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int numero = input.nextInt();
        if (numero<10)
        {
        System.out.print("The sum of the digits is" + numero);
        }
        else if (numero>10 && numero<100)
        {
        int a = numero%10;
        int b = numero/10;
        int c = a+b;
        System.out.print("The sum of the digits is " + c);
        }
        else if (numero>100 && numero<1000)
        {
        int a = numero/100;
        int b = numero%10;
        int c = numero%100;
        int d = c/10;
        int e = a+b+d;
        System.out.println("The sum of the digits is " + e);
        }
    }
}
