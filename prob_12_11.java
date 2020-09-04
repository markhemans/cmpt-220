import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class prob_12_11 {
     

        public static void main(String[] args) {

        if (args.length != 2)
        {
            System.out.println("Please enter arguments in the form: File String");
            System.exit(0);
        }

        
        File file = new File(args[1]);
        if (!file.exists())
        {
            System.out.println(args[1] + " does not exist.");
        }

        
        String word = "";
        try
        {
            Scanner input = new Scanner(file);
            word = input.nextLine();
        }
       
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
        
        word = word.replaceAll(args[0], "");
        try {
            PrintWriter output = new PrintWriter(file);
            System.out.println(word);
            output.write(word);
            output.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }

        
    }
}
