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
public class Engine implements PowerSource {

    @Override
    public void strat() {
        System.out.println("The car is strating!");
    }

    @Override
    public int temprature() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping!");
    }
    
}
