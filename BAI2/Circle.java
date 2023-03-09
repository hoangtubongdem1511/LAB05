/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class Circle extends Shape{
    public double radius=1.0;
    public float PI=(float) 3.14;
    
    public Circle() {
        
    }
    
    public Circle(String color, boolean filled , double radius) {
        super(color, filled);
        this.radius=radius;
    }
    
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return this.PI*this.radius*this.radius;
    }
    
    public double getPerimeter() {
        return (2*Math.PI*this.radius);
    }
    
    @Override
    public String toString() {
        return(super.toString() +"Bán kính ="+this.radius);
    }  
}
