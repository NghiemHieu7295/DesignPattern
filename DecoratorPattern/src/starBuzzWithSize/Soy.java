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
public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = this.beverage.cost();
        switch (this.beverage.getSize()) {
            case TALL:
                cost += .10;
                break;
            case GRANDE:
                cost += .15;
                break;
            default:
                cost += .20;
                break;
        }
        
        return cost;
    }
    
}
