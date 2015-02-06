//Emily Levenson
//January 30, 2015
//cse2 lab 03
//This program will compute the cost of buying Big Macs. It will obtain the 
//number of Big Macs purchased by the user, the cost of each Big Mac, and the sales tax.
//Then it displays the total cost

import java.util.Scanner; //import the scanner class

//define a class
public class BigMac {
    //add a main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare an instance of the Scanner object
        myScanner=new Scanner (System.in); //construct the scanner object
        
        System.out.print("Enter the number of Big Macs(an interger > 0): "); //prompts the user
        int nBigMacs = myScanner.nextInt(); //accepts the user input 
        
        System.out.print("Enter the cost per Big Mac as "+" a double (in the form xx.xx): " ); //prompts the user
        double bigMac$=myScanner.nextDouble();//accepts user input for price
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate= myScanner.nextDouble(); //accepts user input as taxrate
        taxRate/=100; //user enters a percent but I need a proportion
        
        double cost$; //declare the cost variable
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for sotring digits 
                // to the right of the decimal point for the cost$
        cost$=nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction 
        dollars=(int)cost$;
        //get dimes amount, e.g.,
        // (int)(6.73 * 10) % (10) -> 67 % 10 -> 7
        // where the % (modulus) operator returns the remainder after the division
        // 583 % 100 -> 83, 27 % 5 -> 2
        dimes =(int)(cost$*10)%10; //calculates the tenth decimal place
        pennies=(int)(cost$*100)%10; //calculates the hundrth decimal place
        System.out.println("The total cost of " +nBigMacs + " BigMacs, at $"+bigMac$ +" per bigMac, with a sales tax of "+ (int)(taxRate*100) +"%, is $"+dollars+'.'+dimes+pennies+"");
        
        
    }
}