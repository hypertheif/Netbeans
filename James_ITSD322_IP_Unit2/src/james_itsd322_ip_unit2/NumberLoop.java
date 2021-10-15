package james_itsd322_ip_unit2;
import java.util.Scanner;
public class NumberLoop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numInput = 0;
        System.out.println("Please input a number between 5 and 45. To exit input 1.");

        while (numInput != 1) {
            numInput = scnr.nextInt(); //Adds input to declare input for numCheck.
            if (numInput < 5 || numInput > 45) {
                System.out.print ("Please input a number between 5 and 45.");
            }
            else {
                break;
            }
            checkEntry(numInput); // calls checkEntry method
        } // end of while
        System.out.println("Thank you. Goodbye.");
    } // end of main
    
    public static void checkEntry(int numInput) {
        if (numInput < 35) {
            numInput = numInput * 5; // multiply by 5 if input < 35
            System.out.println("Output: " + numInput);
        } // end of if
        else {
            numInput = numInput + 10; // add 10 if input >= 35
            System.out.println("Output: " + numInput);
        } // end of else
    } // end of checkEntry
} // end of class   
