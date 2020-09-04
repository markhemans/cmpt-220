/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (8.10)
 */
public class prob_8_10 {
     public static void main(String[] args) {
     int[][] numbers = new int[4][4];    
     
     int largestRow = 0;
     int largest = -1;
        
     for (int i = 0; i < numbers.length; i++)
     {
        int rowCount = 0;
        for (int k = 0; k < numbers.length; k++)
        {
            numbers[i][k] = (int)(Math.random() * 2);
            rowCount = rowCount + numbers[i][k];
        }
        
        
            if (rowCount > largest)
            {
                largestRow = i;
                largest = rowCount;
            }
        }

      
    int largestCol = 0;
    int largest2 = -1;
    for (int k = 0; k < numbers.length; k++)
    {
        int colCount = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            colCount = colCount + numbers[i][k];
        }
            
        if (colCount > largest2)
        {
            largest2 = colCount;
            largestCol = k;
        }

    }

      
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers[i].length; k++)
            {
                System.out.print(numbers[i][k]);
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + largestRow);
        System.out.println("The largest column index: " + largestCol);
    }

         
         
         
     }
    

