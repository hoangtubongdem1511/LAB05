/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class Rectangle extends Shape {
    public double width=1.0;
    public double length=1.0;
    
    public Rectangle() {
        
    }
    
    public Rectangle(double width, double length) { 
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getArea() {
        return this.width * this.length;
    }
    
    public double getPerimeter() {
        return (this.length+this.width)*2;
    }
    
    @Override
    public String toString() {
        return(super.toString() +", width = "+this.width+", length = "+this.length);
    }
   
}
