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
public class DarkRoast extends Beverage{

    public DarkRoast()
    {
        description = "Most Excellent Dark Roast";
    }
    
    @Override
    public double cost() {
        return .99;
    }
    
}
