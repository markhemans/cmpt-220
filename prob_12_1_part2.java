import java.util.Scanner;
public class prob_12_1_part2 {
     public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
 
    if (args.length != 3) {
      System.out.println("Usage: java Calculator operand1 operator operand2");
      System.exit(0);
    }
    if (!(Math.abs(Integer.parseInt(args[0]))>0) || !(Math.abs(Integer.parseInt(args[2]))>0))
    {
      System.out.println("Please enter an integer"); 
    }
 
    int result = 0;

   
    switch (args[1].charAt(0))
    {
      case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
      case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
      case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
      case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
    }

   
    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
   }
   
   
   
  }
