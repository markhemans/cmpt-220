/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (10.11)
 */
public class prob_10_11 {
    
    public static void main(String[] args) {
       
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " +c1.getPerimeter());
        System.out.println("Does this circle contain the point (3,3)?: " + c1.contains(3,3));
        System.out.println("Does this cirlce contained by a circle with radius 10.5 at centre (4,5)? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Does this cirlce overlap a circle with radius 2.3 at centre (3,5)? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    } 
}
