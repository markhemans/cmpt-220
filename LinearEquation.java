import java.util.Scanner;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (9.11)
 */
    public class LinearEquation
    {
public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        double a = input.nextDouble();
        System.out.print("Enter B: ");
        double b = input.nextDouble();
        System.out.print("Enter C: ");
        double c = input.nextDouble();
        System.out.print("Enter D: ");
        double d = input.nextDouble();
        System.out.print("Enter E: ");
        double e = input.nextDouble();
        System.out.print("Enter F: ");
        double f = input.nextDouble();

        LinearEquation linearEqn = new LinearEquation(a,b,c,d,e,f);

        if (linearEqn.isSolvable())
        {
            System.out.println("X: " + linearEqn.getX() + " Y: " + linearEqn.getY());
        }
        else
        {
            System.out.println("The equation has no denominator.");
        }
    }


    private double a,b,c,d,e,f;

    public LinearEquation(double a, double b, double c, double d, double e, double f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

public double getA()
    {
        return a;
    }
public double getB()
    {
        return b;
    }
public double getC()
    {
        return c;
    }
public double getD()
    {
        return d;
    }
public double getE()
    {
        return e;
    }
 public double getF()
    {
        return f;
    }
 
 
    public void selectA(double a)
    {
        this.a = a;
    }
    public void selectB(double b)
    {
        this.b = b;
    }
    public void selectC(double c)
    {
        this.c = c;
    }
    public void selectD(double d)
    {
        this.d = d;
    }
    public void selectE(double e)
    {
        this.e = e;
    }
    public void selectF(double f)
    {
        this.f = f;
    }

    
    public double getX() {
        return (e * d - b * f) / denominator();
    }


    public double getY() {
        return (a * f - e * c) / denominator();
    }


    
    public boolean isSolvable()
    {
        return denominator() != 0;
    }

    private double denominator()
    {
        return a * d - b * c;
    }

     
}
    

