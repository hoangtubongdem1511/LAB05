/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class Square extends Rectangle{
    public Square() {
        
    }
    
    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    public Square(String color, boolean filled, double side) {
        super.setColor(color);
        super.setFilled(filled);
        super.setWidth(side);
        super.setLength(side);
    }
    
    public double getSide() {
        return super.getWidth();
    }
    
    public void setSide(double Side) {
        super.setWidth(Side);
        super.setLength(Side);
    }
    
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    public void setLenght(double side) {
        super.setLength(side);
    }
    
    @Override
    public String toString() {
    return (super.toString() + ", width = lenght = side = "+this.getSide());
}

    
}
