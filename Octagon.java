/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (13.11)
 */
    public class Octagon extends GeometricObject implements Cloneable {


    double side;


    public Octagon()
    {
        this(5);
    }

    public Octagon(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return (2+(4/Math.sqrt(2)) * side * side);
    }

    @Override
    public double getPerimeter()
    {
        return side * 8;
    }

    public Object clone()
    {
        Object octagon = null;
        try 
        {
            octagon = super.clone();
        }
        catch (CloneNotSupportedException ex)
        {
            ex.printStackTrace();
        }
        return octagon;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Octagon && getArea() == ((Octagon)object).getArea();
    }
}
