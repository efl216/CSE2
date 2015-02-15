//Emily Levenson
//February 13, 2015
//Banking --> This program uses switch statements so users can process banking transactions
//The program starts with a random amount between 1,000-5,000 in their bank account
//and they have the choice of depositing, withdrawing, and then the details of their withdrawel/deposit
//their resulting balance is printed
//import the scanner class
import java.util.*;

//add the  class
public class Banking{
    //add the main method
    public static void main(String[] args){
        //declare an instance of Scanner object, and call Scanner contructor. 
        //tells Scanner that I am creating an instance that will take input from 
        //STDIN
        Scanner myScanner = new Scanner(System.in);
        double y$ = (double)(Math.random() *4000)+1000; //generates random number
        double z$=y$*100; //multiplies the random number by 100 
        int w$=(int) z$; //casts double to integer
        double x$=(double) w$/100; //divides double by 100 to generate $ amount in xx.xx form
        
        
    //------------asks the user what they would like to do---------------------//    
       
        System.out.println("Pick one of the following: 1-Deposit    2-Withdraw     3-View Balance"); 
        int choice1=myScanner.nextInt();  //assigns the user's choice to variable   
        switch (choice1) {                  //begin the switch statement
            case 1:                         //if the user chooses to deposit
                System.out.println("how much do you want to deposit?"); //prompt the user to enter the amount
                 if(myScanner.hasNextDouble()) {    //checks to make sure this amount is a number
                     double deposit$=myScanner.nextDouble();     //store this amount into a variable   
                    
                      if(deposit$>0) {                        //check to make sure the amount if a positive number
                          double balance1$=x$+deposit$;       //compute the new balance
                          System.out.println("Your old balance was $"+x$+"");  //print the old balance
                          System.out.println("Your new balance is $"+balance1$+""); //print the new balance
                      }
                      else {  //if the user did not enter a positive number
                      System.out.println("You need to enter a positive number"); //print error statement
                      }
                    break;  //end case 1
                  }
                 else {
                    System.out.println("Please enter a dollar amount");
                    break;
                    }
                 
            case 2:     //if user chooses to withdraw
                System.out.println("how much do you want to withdraw?");    //prompt the user to enter the amount
                if(myScanner.hasNextDouble()) {     //checks to make sure the amount entered is a number
                     double withdraw=myScanner.nextDouble(); //store this amount into a vairbale
                     double enoughMoney=x$-withdraw; //compute the amount of money the user would have once money is withdrawn
                    
                    if (withdraw>0 && enoughMoney>0) { //makes sure the user has enough money in their account to withdraw the requested amount
                            System.out.println("You have "+enoughMoney+" dollars in your account"); //Print error statement if not
                            break;  //end case 2
                    }
                   else{                               //if the user did not enter a positive number, or there is not enough money in the account
                           
                         if(withdraw>0 && enoughMoney<0) { //checks to see if the user entered an amount too large for their balance
                             System.out.println("You do not have enough money in your account to withdraw that amount"); //print error statment
                            break;
                         }
                         if(withdraw<0 && enoughMoney>0) { //checks to see if the user entered a positive number
                            System.out.println("You did not enter a positive value to withdraw"); //print error statment
                            break;  
                         }
        
                         
                    }
                }
                else {
                    System.out.println("Please enter a dollar amount");
                    break;
                }
            
            case 3: //if the user wants to check their balance
                   System.out.println("Your balance is "+x$+" dollars"); //print the balance
                break; //end case 3
            
        }
    }
}