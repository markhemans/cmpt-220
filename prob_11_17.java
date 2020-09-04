import java.util.ArrayList;
import java.util.Scanner;

public class prob_11_17 {
     public static void main(String[] args) {
        
        System.out.print("Enter an integer m: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        ArrayList<Integer> newFactor = new ArrayList<>();

        getnewFactor(m, newFactor);

        int smallestSquare = smallestSquare(newFactor);
        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
        System.out.println("m * n = " + (m * smallestSquare));
    }

    private static int smallestSquare(ArrayList<Integer> newFactor)
        {
        int[][] k = copy(newFactor);
        for (int i : newFactor)
        {
            findFactor(k, i);
        }

     
        ArrayList<Integer> list = removeDuplicates(k);


        int smallestSquare = 1;
        for (int i : list)
        {
            smallestSquare *= i;
        }
        return smallestSquare;
    }

    private static ArrayList<Integer> removeDuplicates(int[][] m) 
    {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < m.length; i++)
           {
            if (m[i][1] % 2 != 0)
            {
                temp.add(m[i][0]);
            }
        }

       
        ArrayList<Integer> duplicateList = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++)
        {

            if (!duplicateList.contains(temp.get(i)))
            {
                duplicateList.add(temp.get(i));
            }
        }

        return duplicateList;
    }

    private static void findFactor(int[][] m, int number)
    {
        for (int i = 0; i < m.length; i++)
        {
            if (m[i][0] == number)
            {
                m[i][1]++;
            }
        }
    }

    private static int[][] copy(ArrayList<Integer> newFactor) {

        int[][] temp = new int[newFactor.size()][2];

        for (int i = 0; i < temp.length; i++)
        {
            temp[i][0] = newFactor.get(i);
        }
        return temp;
    }

    private static void getnewFactor(int m, ArrayList<Integer> newFactor) {

        int count = 2;
        while (count <= m)
        {
            if (m % count == 0)
            {
                newFactor.add(count);
                m = m/count;
            } 
            else 
            {
                count++;
            }
        }
    }

    
}
