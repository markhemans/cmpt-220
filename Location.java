import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (9.13)
 */
public class Location {
    
public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] array = new double[row][column];

        System.out.println("Enter the array:");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = input.nextDouble();
            }
        }

        Location findLocation = Location.locateLargest(array);

        System.out.println("The location of the largest element is " + findLocation.maxValue + " at (" + findLocation.row + ", " + findLocation.column + ")");
    }


    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue)
    {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a)
    {
        int row = 0;
        int column = 0;
        double maxValue = a[row][column];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                if (maxValue < a[i][j])
                {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new Location(row,column,maxValue);
    }

}
