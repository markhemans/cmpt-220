import java.util.Scanner;


public class prob_11_1 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three lengths for the triangle: ");
        
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        
        System.out.println("What color is the triangle?: ");
        String color = input.next();
        
        System.out.println("Is the triangle filled? true or false?: ");
        String isFilledString = input.next();
        boolean isFilled = (isFilledString.equals("true"));
        
        
        Triangle testTriangle = null;
        
        testTriangle = new Triangle(side1, side2, side3);
        testTriangle.setColor(color);
        testTriangle.setFilled(isFilled);
      
            System.out.println("Area: " + testTriangle.getArea());
            System.out.println("Perimeter: " + testTriangle.getPerimeter());
            System.out.println("Color: " + testTriangle.getColor());
            System.out.println("Is filled?: " + testTriangle.isFilled());
        
        
    }
}

