import java.util.ArrayList;
import java.util.Scanner;


public class prob_11_11 {
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 numbers: ");
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 5; i++)
        {
            list.add(input.nextInt());
        }
    
    sort(list);
    System.out.println("Sorted List: "+ list);

    }

    public static void sort(ArrayList<Integer> list)
    {
        for (int i=0; i<list.size()-1; i++)
        {
            int min = list.get(i);
            int position = i;

            for (int j=i+1; j<list.size(); j++)
            {
                if (min > list.get(j))
                {
                    min = list.get(j);
                    position = j;
                }
            }

            if (position != i)
            {
                list.set(position, list.get(i));
                list.set(i, min);
            }
        }

    }  
    
}
