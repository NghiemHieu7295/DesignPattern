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
public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + this.beverage.cost();
    }
    
}
