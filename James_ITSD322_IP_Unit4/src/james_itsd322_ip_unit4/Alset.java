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
public class Alset {
    
    public int numDoors = 4; //declares numDoors
    public int chargeCable = 1; //declares chargeCable
    public String paintColor = "Green"; //declares paintColor
    public String freeCharge = "No"; //declares freeCharge
    public String output;  //declares output
    
    /**
     * sets new paintColor
     * @param newPaintColor 
     */
    public void setPaintColor(String newPaintColor) {
        paintColor = newPaintColor;
    }//end of setPaintColor
    
    /**
     * Alset default displayInfo
     */
    public void displayInfo() {
        output = "Number of doors: " + numDoors + "\n"
        + "Number of charging cables: " + chargeCable + "\n"
        + "Color of paint: " + paintColor + "\n"
        + "Free charging: " + freeCharge + "\n"; //creates output string
        System.out.print(output); //prints output
    }//end of displayInfo
}//end of class
