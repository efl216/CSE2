

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
    
        System.out.print("Enter a double with four digits after the decimal: "); //prompts the user
        double number = myScanner.nextDouble(); //accepts the user input 
 
 
                /// Need to access every digit after the decimal point
                double firstdigit = (number*10000) % 10000; //access first digit by getting rid of the decimal and finding remainder 
                double firstdigit1 = firstdigit / 1000; //turn the first digit back into the form of x.xxxxxx (one number before the decimal)
                int firstdigitInt= (int) firstdigit1; //truncate the decimals and you're left with the first digit after the decimal
                double secondDigit= (number*1000) % 100; //same procedure but finding digit 2
                double secondDigit1= secondDigit/10; 
                int secondDigitInt=(int) secondDigit1;
                double thirdDigit= (number*10000) % 100; //accessing digit number 3
                double thirdDigit1= thirdDigit/10;
                int thirdDigitInt=(int) thirdDigit1; //truncates the decimal and left with third digit
                double fourthDigit= (number*10000) % 10; //accessing digit number 4
                double fourthDigit1= fourthDigit/1;  
                int fourthDigitInt=(int) fourthDigit1; //truncate the decimal and left with fourth digit
                
                
                //printing all the digits sequentially 
                System.out.println("The number is "+firstdigitInt+""+secondDigitInt+""+thirdDigitInt+""+fourthDigitInt+"");

    }
}