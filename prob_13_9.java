/*
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (13.9)
 */
public class prob_13_9 {
    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(20);

        System.out.println("Does Circle 1 equal Circle 2? " + circle1.equals(circle2));
        System.out.println("Does Circle 1 equal Circle 3? " + circle1.equals(circle3));
  
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public Circle(double radius,String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

   
    public double getRadius()
    {
        return radius;
    }

   
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    /** Return area */
    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter()
    {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object shape)
    {
        return shape instanceof Circle && radius == ((Circle)shape).radius;
    }

    public void printCircle()
    {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    
}
