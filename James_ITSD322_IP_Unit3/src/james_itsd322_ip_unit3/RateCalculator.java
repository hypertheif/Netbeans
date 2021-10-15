/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james_itsd322_ip_unit3;

/**
 *
 * @author reine
 */
public class RateCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstNum = 6; //declares firstNum is integer 5
        int secondNum = 2; //declares secondNum is integer 3
        int output; //declares output

        Calculator myCalc = new Calculator(); //calls to Calculator.java file as myCalc
        
        output = myCalc.Multiply(firstNum, secondNum); //calls to method Multiply using declared integers
        System.out.println(output); //displays output
        
        output = myCalc.Add(firstNum, secondNum); //calls to method Add using declared integers
        System.out.println(output); //displays output
        
        output = myCalc.Subtract(firstNum, secondNum); //calls to method Subtract using declared integers
        System.out.println(output); //displays output
        
        output = myCalc.Divide(firstNum, secondNum); //calls to method Divide using declared integers
        System.out.println(output); //displays output
        
    } //end of Main
    
 } //end of class
