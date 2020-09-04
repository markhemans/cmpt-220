/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (10.3)
 */

public class MyInteger
{

    private int value;

    
    
    public MyInteger(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public boolean isEven()
    {
        return value % 2 == 0;
    }

    public boolean isOdd()
    {
        return value % 2 == 1;
    }

    public boolean isPrime()
    {
        double top = value;
        for (int i = 2; i < value; i++)
        {
            if (value % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    
    
    public static boolean isEven(int value)
    {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value)
    {
        return !(value % 2 == 0);
    }

    
    public static boolean isPrime(int value)
    {
         double top = value;
        for (int i = 2; i < value; i++)
        {
            if (value % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    
    
    
    public static boolean isEven(MyInteger myInteger)
    {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger)
    {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger)
    {
        return myInteger.isPrime();
    }

    public boolean equals(int value)
    {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger)
    {
        return this.value == myInteger.value;
    }


    public static int parseInt(char[] value)
    {

        double parsed = 0;
        int power = value.length - 1;
        
        for (char values : value)
        {
            parsed += Math.pow(10, power--) * (values - '0');
        }

        return (int)parsed;
    }

    public static int parseInt(String value)
    {
        return MyInteger.parseInt(value.toCharArray());
    }
}
    

