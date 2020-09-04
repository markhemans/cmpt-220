/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public abstract class GeometricObject implements Comparable<GeometricObject> {
    public String color = "white";
    public boolean filled;
    private java.util.Date dateCreated;
    
    public GeometricObject()
    {
        dateCreated = new java.util.Date();
    }
    
    public GeometricObject(String color, boolean filled)
    {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
     this.color = color;   
    }
    
    public boolean isFilled()
    {
     return filled;   
    }
    
    public void setFilled(boolean filled)
    {
     this.filled = filled;   
    }
    
    public java.util.Date getDateCreated()
    {
    return dateCreated;   
    }
    
    public String toString()
    {
    return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled; 
    }

    @Override
    public int compareTo(GeometricObject object) 
    {
        if (getArea() > object.getArea())
        {
            return 1;
        }
        else if (getArea() < object.getArea())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    public static GeometricObject max(GeometricObject object1, GeometricObject object2)
    {
        return (object1.compareTo(object2) >= 0) ? object1 : object2;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
