/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (13.7)
 */
public class prob_13_7  {
 
    public String howToColor()
     {
        return "Color all four sides";
     }
   
interface Colorable 
{ 
String howToColor();
}

public static void main(String[] args)
{
Triangle triangle = new Triangle(5,5,5);
Square square = new Square(5);
Rectangle rectangle = new Rectangle(5,5);
Circle2D circle = new Circle2D(5,5,5);
      
            System.out.println(triangle.getArea());
            if (triangle instanceof Colorable) 
            {
                System.out.println("How to color: "+((Colorable)triangle).howToColor());
            }
            System.out.println(square.getArea());
            if (square instanceof Colorable) 
            {
                System.out.println("How to color: "+((Colorable)square).howToColor());
            }
            System.out.println(rectangle.getArea());
            if (rectangle instanceof Colorable) 
            {
                System.out.println("How to color: "+((Colorable)rectangle).howToColor());
            }
            System.out.println(circle.getArea());
            if (circle instanceof Colorable) 
            {
                System.out.println("How to color: "+((Colorable)circle).howToColor());
            }
        }
}
 

