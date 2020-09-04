/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (12.7)
 */
public class prob_12_7 {
    public static void main(String[] args) {

        try
        {
        System.out.println(bin2Dec("110011"));
        System.out.println(bin2Dec("test"));
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Not a binary number.");
        }
    }
    public static int bin2Dec(String binary) throws NumberFormatException {

        int position = 0;
        int power = 0;
        for (int i = binary.length()-1; i >= 0; i--)
        {
            
            if (binary.charAt(i) == '1')
            {
            position += Math.pow(2, power);
            power++;
            }
            else if (binary.charAt(i) == '0')
                {
                position += Math.pow(2, power);
                power++;
                }
            
            else
            {
            throw new NumberFormatException();
            }
            }
         return position;
    }
}
    
    

    

    
