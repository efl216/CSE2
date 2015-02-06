

//Emily Levenson
//cse2 hw 3
//February 6, 2015
// this program prompts the user to enter a value and then 
//prints out the first four digits to the right of the decimal point

import java.util.Scanner; //import the scanner class

//define a class
public class FourDigits {
    //add a main method
    public static void main(String[] args) {
        Scanner myScanner; //declare and instance of the scanner object
        
         myScanner=new Scanner (System.in); //construct the scanner object
    
        System.out.print("Enter a double: "); //prompts the user
        double number = myScanner.nextDouble(); //accepts the user input 
        
        //obtaining only the four decimal points
      double num= number / 10;
       double num1= (double) num*100000;
        int num2= (int) num1;
        int num3= num2 % 10000;
        
    System.out.println("The number is "+num3+"");
    }
}