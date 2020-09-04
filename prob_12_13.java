/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (12.13)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob_12_13 {
    

    public static void main(String[] args) {

        if (args.length != 1)
        {
            System.out.println("Please enter arguments in the form: File");
            System.exit(0);
        }
        
        File filename = new File(args[0]);
        if (!filename.exists())
        {
            System.out.println("File does not exist.");
            System.exit(0);
        }

        int characters = 0;
        int lines = 0;
        int words = 0;
        
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext())
            {
                String s = input.nextLine();
                lines++;
                
                characters = characters + s.length();
                
                String[] split = s.split(" ");
                for (String word : split)
                {
                    words++;
                }
            }

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File does not exist.");
            System.exit(0);
        }

        System.out.println("Characters: " + characters);
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
    }
}
    
