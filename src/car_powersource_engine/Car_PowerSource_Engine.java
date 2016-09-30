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
public class Car_PowerSource_Engine {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Car ford= new Car();
        Engine eng = new Engine();
        
        ford.setEng(eng);
        ford.run();
       
    }
    
}
