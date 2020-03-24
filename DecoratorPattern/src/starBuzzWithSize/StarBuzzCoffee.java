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
public class StarBuzzCoffee {
    
    public static void main(String[] args)
    {
        Beverage beverage1 = new Espresso();
        beverage1.setSize(Beverage.Size.VENTI);
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
