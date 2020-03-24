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
public class Soy extends CondimentDecorator{

    Beverage beverage;
    
    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        return .15 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
    
}
