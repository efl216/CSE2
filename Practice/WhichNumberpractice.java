 //Emily Levenson
//February 13, 2015
//cse2 hw04
//WhichNumber --> Program that prompts the user to enter an integer between 1-10 (inclusive)
//Then the program asks the user questions in an attempt to guess what number the user is thinking of.

//import the scanner class
import java.util.Scanner;

//add the Cookies class
public class WhichNumberpractice{
    //add the main method
    public static void main(String[] args){
        //declare an instance of Scanner object, and call Scanner contructor. 
        //tells Scanner that I am creating an instance that will take input from 
        //STDIN
        Scanner myScanner = new Scanner(System.in);

 
 System.out.print("Enter a number between 1 and 10, inclusive");
        //checks to make sure the number inputted is an integer
        if (myScanner.hasNextInt()) { //checks to make sure an int is entered
          int number= myScanner.nextInt(); //assigns the int to a variable
                System.out.print("Is the number even? ");
                    if(myScanner.next().equalsIgnoreCase("y")) {
                     System.out.print("Is it divisible by 3 ");
                          if(myScanner.next().equalsIgnoreCase("y")) {
                            System.out.println("Your number is 6");
                            return;
                             }
                           //
                             if(myScanner.next().equalsIgnoreCase("n")) {
                                 System.out.print("Is it divisible by 4 ");
                                    if(myScanner.next().equalsIgnoreCase("y")) {
                                      System.out.print("Is the number divided by 4 greater than 1? "); 
                                         if(myScanner.next().equalsIgnoreCase("y"))  { 
                                             System.out.print("Your number is 8");
                                             return;
                                            }
                                            
                                                if(myScanner.next().equalsIgnoreCase("n")) {
                                                    System.out.print("Your number is 4");
                                                    return;
                                                }
                                            else{  
                                                 System.out.print("Invalid input");
                                            }
                                        
                                            }
                                    } 
                                    if(myScanner.next().equalsIgnoreCase("n")) {
                                        System.out.print("Is the number divisble by 5? "); 
                                            if (myScanner.next().equalsIgnoreCase("y")) {
                                                System.out.print("Your number is 10");
                                                return;
                                            }
                                            else {
                                                if (myScanner.next().equalsIgnoreCase("n")) {
                                                System.out.print("Your number is 2");    
                                                }
                                            else {
                                             System.out.print("Invalid input");
                                              return; 
                                            }
                                            }
                                    }
                                    else {
                                        System.out.print("Invalid input");
                                        return;
                                    }
                                    }
                                    
                                                
                                        
                                }
                    }
        }
         
    
