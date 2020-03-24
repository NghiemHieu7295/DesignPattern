/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starBuzzWithSize;

/**
 *
 * @author Ominext
 */
public abstract class Beverage {
    
    public enum Size {TALL, GRANDE, VENTI};
    String description = "Unknown Beverage";
    Size size = Size.TALL;
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setSize(Size size)
    {
        this.size = size;
    }
    
    public Size getSize()
    {
        return this.size;
    }
    
    public abstract double cost();
}
