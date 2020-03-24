/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ominext
 */
public class StatisticsDisplay implements Observer, DisplayElement{

    Observable observable;
    private float minTemperature = Float.MAX_VALUE;
    private float maxTemperature = 0f;
    private float avgTemperature;
    
    public StatisticsDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData) o;
            float temperature = weatherData.getTemperature();
            
            if(temperature < this.minTemperature)
            {
                this.minTemperature = temperature;
            }
            
            if(temperature > this.maxTemperature)
            {
                this.maxTemperature = temperature;
            }
            
            this.avgTemperature = (this.minTemperature + this.maxTemperature) / 2;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + this.avgTemperature + "/" + this.maxTemperature + "/" + this.minTemperature);
    }
    
}
