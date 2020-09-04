
import java.util.Scanner;
/**
 *
 * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (3.5)
 */
public class prob_3_5 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Today's day: ");
        int today = input.nextInt();
        
        System.out.print("Enter the number of days elapsed since today: ");
        int futuredays = input.nextInt();
        int finalday = 0;
        
    switch (today)
    {
    case 0:
        System.out.print("Today is Sunday");
        finalday = today + futuredays;
        switch (finalday%7)
        {
            case 0: System.out.println(" and the future day is Sunday");
            break;
            case 1: System.out.println(" and the future day is Monday");
            break;
            case 2: System.out.println(" and the future day is Tuesday");
            break;
            case 3: System.out.println(" and the future day is Wednesday");
            break;
            case 4: System.out.println(" and the future day is Thursday");
            break;
            case 5: System.out.println(" and the future day is Friday");
            break;
            case 6: System.out.println(" and the future day is Saturday");
            break;
        }
    break;
    case 1: 
        System.out.print("Today is Monday");
        finalday = today + futuredays;
        switch (finalday%7)
        {
            case 0: System.out.println(" and the future day is Sunday");
            break;
            case 1: System.out.println(" and the future day is Monday");
            break;
            case 2: System.out.println(" and the future day is Tuesday");
            break;
            case 3: System.out.println(" and the future day is Wednesday");
            break;
            case 4: System.out.println(" and the future day is Thursday");
            break;
            case 5: System.out.println(" and the future day is Friday");
            break;
            case 6: System.out.println(" and the future day is Saturday");
            break;
        }
    break;
    case 2: 
        System.out.print("Today is Tuesday");
        finalday = today + futuredays;
       switch (finalday%7)
        {
            case 0: System.out.println(" and the future day is Sunday");
            break;
            case 1: System.out.println(" and the future day is Monday");
            break;
            case 2: System.out.println(" and the future day is Tuesday");
            break;
            case 3: System.out.println(" and the future day is Wednesday");
            break;
            case 4: System.out.println(" and the future day is Thursday");
            break;
            case 5: System.out.println(" and the future day is Friday");
            break;
            case 6: System.out.println(" and the future day is Saturday");
            break;        
       }
    break;
    case 3: 
        System.out.print("Today is Wednesday");
        finalday = today + futuredays;
        switch (finalday%7)
        {
            case 0: System.out.println(" and the future day is Sunday");
            break;
            case 1: System.out.println(" and the future day is Monday");
            break;
            case 2: System.out.println(" and the future day is Tuesday");
            break;
            case 3: System.out.println(" and the future day is Wednesday");
            break;
            case 4: System.out.println(" and the future day is Thursday");
            break;
            case 5: System.out.println(" and the future day is Friday");
            break;
            case 6: System.out.println(" and the future day is Saturday");
            break;
        }
    break;
    case 4: 
        System.out.print("Today is Thursday");
        finalday = today + futuredays;
        switch (finalday%7)
        {
            case 0: System.out.println(" and the future day is Sunday");
            break;
            case 1: System.out.println(" and the future day is Monday");
            break;
            case 2: System.out.println(" and the future day is Tuesday");
            break;
            case 3: System.out.println(" and the future day is Wednesday");
            break;
            case 4: System.out.println(" and the future day is Thursday");
            break;
            case 5: System.out.println(" and the future day is Friday");
            break;
            case 6: System.out.println(" and the future day is Saturday");
            break;
        }
    break;
    case 5: 
        System.out.print("Today is Friday");
        finalday = today + futuredays;
        switch (finalday%7)
        {
            case 0: System.out.println(" and the future day is Sunday");
            break;
            case 1: System.out.println(" and the future day is Monday");
            break;
            case 2: System.out.println(" and the future day is Tuesday");
            break;
            case 3: System.out.println(" and the future day is Wednesday");
            break;
            case 4: System.out.println(" and the future day is Thursday");
            break;
            case 5: System.out.println(" and the future day is Friday");
            break;
            case 6: System.out.println(" and the future day is Saturday");
            break;
        }
    break;
    case 6: 
        System.out.print("Today is Saturday");
        finalday = today + futuredays;
        switch (finalday%7)
        {
            case 0: System.out.println(" and the future day is Sunday");
            break;
            case 1: System.out.println(" and the future day is Monday");
            break;
            case 2: System.out.println(" and the future day is Tuesday");
            break;
            case 3: System.out.println(" and the future day is Wednesday");
            break;
            case 4: System.out.println(" and the future day is Thursday");
            break;
            case 5: System.out.println(" and the future day is Friday");
            break;
            case 6: System.out.println(" and the future day is Saturday");
            break;
        }
    break;
    }
    }
}
