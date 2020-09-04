import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (8.5)
 */
public class prob_8_5 {
    public static void main(String[] args)
    {
    DecimalFormat df = new DecimalFormat(".##");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter matrix1: ");
    double[][] matrix1 = new double[3][3];
    for (int i = 0; i < matrix1.length; i++)
    {
            for (int j = 0; j < matrix1[i].length; j++)
            {
                matrix1[i][j] = input.nextDouble();
            }
    }
    
    System.out.print("Enter matrix2: ");
    double[][] matrix2 = new double[3][3];
    for (int i = 0; i < matrix2.length; i++)
    {
            for (int j = 0; j < matrix2[i].length; j++)
            {
                matrix2[i][j] = input.nextDouble();
            }
    }
    
    
    
    double[][] addedMatrix = addMatrix(matrix1, matrix2);
    
    
    
    
    for (int i = 0; i < matrix1.length; i++)
    {
        for (int j = 0; j < matrix1[i].length; j++)
        {
                System.out.printf("%3s", df.format(matrix1[i][j]));
                if (i == 1 && j == 2)
                {
                    System.out.printf("%3s ", " + ");
                }
                else System.out.printf("%3s ", " ");
        }
        
            for (int k = 0; k < matrix2[i].length; k++) {
                System.out.printf("%3s ",df.format(matrix2[i][k]));
                if (i == 1 && k == 2)
                {
                    System.out.printf("%3s ", " = ");
                }
                else System.out.printf("%3s ", " ");

            }
            for (int k = 0; k < addedMatrix[i].length; k++) {
                System.out.printf("%4s ", df.format(addedMatrix[i][k]));
            }
             System.out.println();
    }
    }
    
    
    public static double[][] addMatrix(double[][] a, double[][] b)
    {
        double[][] addedMatrix = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[0].length; k++) {
                addedMatrix[i][k] = a[i][k] + b[i][k];
            }
        }

        return addedMatrix;
    }
    
}
