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
public class Type3 extends Alset /*extends super class Alset to Type3*/ {
    public String gpsNav = "Yes"; //declares gpsNav
    public String sunroof = "Yes"; //declares sunroof
    private String features = "GPS Navigation: " + gpsNav + "\n"
            + "Sunroof: " + sunroof; //declares features
    /**
     * Overrides Alset, Type1, and Type2 displayInfo
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