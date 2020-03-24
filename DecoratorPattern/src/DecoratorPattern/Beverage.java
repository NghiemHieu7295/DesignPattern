/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author Ominext
 */
public abstract class Beverage {
    
    String description = "Unknown Beverage";
    double milkCost;
    double soyCost;
    double mochaCost;
    double whipCost;
    
    
    
    public String getDescription()
    {
        return description;
    }
    
    public abstract double cost();
}
