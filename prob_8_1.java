import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (8.1)
 */
public class prob_8_1 {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a 3x4 Matrix");
    double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = input.nextDouble();
            }
        }
        
        for (int i = 0; i < 4; i++)
        {
            System.out.println("Sum of the elements at column " + i +" is " + sumColumn(matrix, i));
        }
    }  
    
    public static double sumColumn(double[][] m, int columnIndex)
    {
    double total = 0;
    for (int i = 0; i < m.length; i++)
    {
         total = total + m[i][columnIndex];
    }
        return total;
    }

}
