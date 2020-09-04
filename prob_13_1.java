import java.util.Scanner;

 public class prob_13_1 {
   


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of Side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of Side 2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of Side 3: ");
        double side3 = input.nextDouble();
        
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();
        
        System.out.print("Is the triangle filled? true/false: ");
        String isFilledString = input.next();
        boolean isFilled = (isFilledString.equals("true"));

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());


    }

}
    
