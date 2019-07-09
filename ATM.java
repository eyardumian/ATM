import java.util.Scanner;
/**
 *Application that allows the user to enter a dollar amount and
 *then displays the combination of various denominations.
 *
 *Project 2 (ATM)
 *@author Erika Yardumian 
 *@version 8/30/18
 */
public class ATM
{
   /**
    *Displays a combination of various denominations.
    *@param args - Command line arguments - not used.
    */
  
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      int amountEntered = 0;
      int twenties = 0;
      int tens = 0;
      int fives = 0;
      int ones = 0;
      int calculation = 0;
      
      //Prompt the user for enter a value:
      System.out.print("Enter the amount: ");
      amountEntered = userInput.nextInt();
      
      //Calculate amount of each denomination:
      if (amountEntered > 500) {
         System.out.println("Limit of $500 exceeded!");
      }
      else {
         twenties = amountEntered / 20;
         tens = (amountEntered - (twenties * 20)) / 10;
         fives = (amountEntered - ((twenties * 20) + (tens * 10))) / 5;
         ones = (amountEntered - ((twenties * 20) + (tens * 10) + (fives * 5)))
             / 1;
         //Display bills by domination:
         System.out.println("Bills by denomination: ");
         System.out.println("\t$20: " + twenties);
         System.out.println("\t$10: " + tens);
         System.out.println("\t$5: " + fives);
         System.out.println("\t$1: " + ones);
         System.out.println("$" + amountEntered + " = " + "(" + twenties  
            + " * $20" + ")" + " + " + "(" + tens + " * $10" + ")" + " + " 
            + "(" + fives + " * $5" + ")" + " + " + "(" + ones + " * $1" + ")");
      }
   }
}
