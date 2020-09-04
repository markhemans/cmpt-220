/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author mark
 */
public class proj02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        int a = (int)celsius;
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("" +a + " celsius is " + fahrenheit + " fahrenheit");
        
    }
}
