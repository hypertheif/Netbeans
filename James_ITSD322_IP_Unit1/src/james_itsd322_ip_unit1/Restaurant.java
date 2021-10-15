package james_itsd322_ip_unit1;
import java.util.Scanner;
public class Restaurant {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String faveRestaurant; //Declares character input for restaurant.
      String locationRestaurant; //Declares character input for location.
      int eatOut; //Declares numeric input for times eaten out.

      System.out.print("What is your favorite restaurant please? "); //Asks for favorite restaurant.
      faveRestaurant = scnr.nextLine(); //Adds input to declared input for restaurant.
      System.out.println("Thank you! You entered " + faveRestaurant + "."); //Displays output message.
      
      System.out.print("What is the location of your favorite restaurant please? "); //Asks for favorite restaurant location.
      locationRestaurant = scnr.nextLine(); //Adds input to declared input for restaurant location.
      System.out.println("Thank you! You entered " + locationRestaurant + "."); //Displays output message.

      System.out.print("How often do you eat at a restaurant each month? "); //Asks for amount of times have eaten out a month.
      eatOut = scnr.nextInt(); //Adds input to declared input for restaurant location.
      if (eatOut < 11) {
        System.out.println("Thank you! You entered " + eatOut + " times.");        
      } else {
          System.out.println("Consider cooking at home to save money!");  
       } /* Will display "Consider cooking at home to save money!" only if a number larger than 10 is entered. */
      
      System.out.println("Thank you for all of your input! Have a good day."); //Displays output message.
   }
}