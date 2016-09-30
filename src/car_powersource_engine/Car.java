/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_powersource_engine;

/**
 *
 * @author mojtabaahmadi
 */
public class Car {
    
    private PowerSource eng;
    
    public void setEng(PowerSource e){
        eng=e;
    }

      
    public void run(){
        eng.strat();
        System.out.println("The car is running");
        eng.stop();
    }
}
