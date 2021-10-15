/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james_itsd322_ip_unit4;
import java.util.Scanner;
/**
 *
 * @author reine
 */
public class James_ITSD322_IP_Unit4 {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userType; //Declares numeric input for type.
                
        System.out.println("Please enter 1 for Type 1, 2 for Type 2, or 3 for Type 3."); //prints request for Type
        userType = scnr.nextInt(); //user input
                        
        if (userType == 1) {
        Type1 vehicle1 = new Type1(); //calls to subclass Type1
        vehicle1.displayInfo(); //pulls and prints out subclass with subclass additions
        }//end of if
        else if (userType == 2) {
        Type2 vehicle2 = new Type2(); //calls to subclass Type2
        vehicle2.setPaintColor("Blue"); //changes paintColor
        vehicle2.displayInfo(); //pulls and prints out subclass with subclass additions
        }//end of else if Type2
        else if (userType == 3) {
        Type3 vehicle3 = new Type3(); //calls to subclass Type3
        vehicle3.setPaintColor("Red"); //changes paintColor
        vehicle3.displayInfo(); //pulls and prints out subclass with subclass additions
        }//end of else if Type3
        else {
            System.out.println("Please choose from Type 1, 2, or 3."); //requests correct number input
        }
    } //end of Main
    
} //end of class
