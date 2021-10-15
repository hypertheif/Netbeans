package james_itsd322_ip_unit5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class James_ITSD322_IP_Unit5 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum1 = 1;//declares userNum1 as 1
        int userNum2 = 1;//declares userNum2 as 1
        int userNum3 = 1;//declares userNum3 as 1
        int sum = 1;//declares sum as 1
        int total = 1;//declares total as 1

        try {
            System.out.println("Please enter a number.");//requests user input for first number
            userNum1 = scnr.nextInt();//user input
            
            System.out.println("Please enter a second number.");//requests user input for second number
            userNum2 = scnr.nextInt();//user input
            
            System.out.println("Please enter a third number.");//requests user input for third number
            userNum3 = scnr.nextInt();//user input
        }//end of try
        catch (InputMismatchException ex) {
            System.err.println("Please only enter numbers.");//catches error if a letter is inputted
        }//end of catch
        
        try {
        sum = userNum1 + userNum2 + userNum3; //adds numbers
        total = sum / userNum3; //divide sum by third number input
        }
        catch (ArithmeticException ex) {
            System.err.println ("Divide by zero error.");//catches error if divided by zero
        }//end of catch
    
        System.out.println("Total: " + total);//total output
    } //end of main
    
}//end of class
