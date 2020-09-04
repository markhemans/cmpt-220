/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class Square extends GeometricObject implements Colorable {

    
    private double side;

    Square()
    {
        this(5);
    }
    
     public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    Square(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return side * side;
    }
   
    @Override
    public double getPerimeter()
    {
        return side * 4;
    }
    

     public String howToColor()
     {
        return "Color all four sides";
     }

    private static class square {

        
    
    interface Colorable
    {
    String howToColor(); 
    }
    }
  
}

 
