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
public class Type1 extends Alset /*extends super class Alset to Type1*/ {
    public String features = "No Additional Features"; //declares features

    /**
     * Overrides Alset displayInfo
     */
    @Override
    public void displayInfo() {
        output = "Number of doors: " + numDoors + "\n"
        + "Number of charging cables: " + chargeCable + "\n"
        + "Color of paint: " + paintColor + "\n"
        + "Free charging: " + freeCharge + "\n" + features + "\n"; //creates output string
        System.out.print(output); //prints output
    }//end of displayInfo
}//end of Type1
