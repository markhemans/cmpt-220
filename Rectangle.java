/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (9.1)
 */
public class Rectangle extends GeometricObject{
     public static void main(String[] args){
         
         Rectangle rectangle1 = new Rectangle();
         System.out.println("Rectangle 1");
         System.out.println("Width = " + rectangle1.width + " Height = " + rectangle1.height + " Area = " + rectangle1.getArea() + " Perimeter = " + rectangle1.getPerimeter());
         System.out.println("Rectangle 2");
         Rectangle rectangle2 = new Rectangle(3.5,35.9);
         System.out.println("Width = " + rectangle2.width + " Height = " + rectangle2.height + " Area = " + rectangle2.getArea() + " Perimeter = " + rectangle2.getPerimeter());
            
     }
     
     double height;
     double width;
     
     Rectangle ()
     { 
         height= 40 ; width= 4 ;
     }
     
     Rectangle(double newWidth, double newHeight)
     {
         width= newWidth; height= newHeight;
     }
     
     public double getArea()
     {
         return width*height;
     }
     
     public double getPerimeter()
     {
         return (2*height)+(2*width);
     }
}
