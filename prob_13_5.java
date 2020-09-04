/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class prob_13_5 {
    public static void main(String[] args){

        Circle2D circle1 = new Circle2D(0, 0, 5);
        Circle2D circle2 = new Circle2D(0, 0, 2);
        Circle2D maxCircle = (Circle2D)GeometricObject.max(circle1, circle2);
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Max circle is: " + maxCircle);

        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(10, 20);
        Rectangle maxRectangle = (Rectangle)GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Rectangle 2: " + rectangle2);
        System.out.println("Max Rectangle is: " + maxRectangle);


    }
    
}
