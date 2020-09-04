import java.util.ArrayList;

public class prob_13_3 {
     
    public static void sort(ArrayList<Number> list)
     {
         
        for (int i = 0; i < list.size() - 1; i++)
        {
            Number min = list.get(i);
            int index = i;

            for (int j = i + 1; j < list.size(); j++)
            {
                if (min.doubleValue() > list.get(j).doubleValue())
                {
                    min = list.get(j);
                    index = j;
                }
            }

            if (index != i)
            {
                list.set(index, list.get(i));
                list.set(i, min);
            }
        }

    }
}
    

