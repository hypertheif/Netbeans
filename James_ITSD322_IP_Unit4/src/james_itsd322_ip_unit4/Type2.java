/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james_itsd322_ip_unit4;

/**
 *
 * @author reine
 */
public class Type2 extends Alset /*extends super class Alset to Type2*/ {
    public String gpsNav = "Yes"; //declares private features
    public String features = "GPS Navigation: " + gpsNav; //declares features
    
    /**
     * Overrides Alset and Type1 displayInfo
     */
    @Override
    public void displayInfo() {
        output = "Number of doors: " + numDoors + "\n"
        + "Number of charging cables: " + chargeCable + "\n"
        + "Color of paint: " + paintColor + "\n"
        + "Free charging: " + freeCharge + "\n" + features + "\n"; //creates output string
        System.out.print(output); //prints output
    }//end of displayInfo
    
}//end of Type2
