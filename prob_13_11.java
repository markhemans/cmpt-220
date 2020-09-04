/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class prob_13_11 {
     public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = (Octagon)octagon1.clone();
        System.out.println("Area: " + octagon1.getArea());
        System.out.println("Area: " + octagon1.getPerimeter());
        System.out.println("Is  " + (octagon1.compareTo(octagon2) == 0));
        System.out.println("Are they equal?: " + octagon1.equals(octagon2));
        System.out.println("Are they the same object?:" + (octagon1 == octagon2));
    }
    
}
