//Lab04
//Emily Levenson
// February 11
//This program uses the scanner class to obtain how many cookies
//the user wants, how many people theyre buying it for, how many
//cookies each person should get, and whether the cookies is evenly 
//divisble among the people and if there is enough for each person

//import the scanner class
import java.util.Scanner;

//add the Cookies class
public class Cookies{
    //add the main method
    public static void main(String[] args){
        //declare an instance of Scanner object, and call Scanner contructor. 
        //tells Scanner that I am creating an instance that will take input from 
        //STDIN
        Scanner myScanner = new Scanner(System.in);
        
        //prompt the user to enter number of people
        System.out.print("Enter the number of People: ");
        //checks to make sure the number inputted is an integer
           
            if (myScanner.hasNextInt()) { //checks to make sure an int is entered
                int numPeople = myScanner.nextInt(); //assigns the int to a variable
        
                   if (numPeople > 0 ) { //checks to make sure the num of ppl is more than zero
                     System.out.print("Enter the number of Cookies:  "); //prompts user to enter num of cookies
                       
                        if (myScanner.hasNextInt()) { //checks to make sure an int is entered
                           int numCookies = myScanner.nextInt(); //assigns this int to a variable
                           System.out.print("How many cookies do you want each person to get?:  "); //prompts the user to enter num of cookies per person
                            
                            if (myScanner.hasNextInt()) {   //checks to make sure an int was entered
                                 int numPerPerson=myScanner.nextInt(); //assigns the int to a variable
                                 int numNeeded= numPerPerson*numPeople; //computes the number of cookies needed
                                 int numHave=numCookies-numNeeded;  //computes whether or not there will be enough cookies 
                                 int evenlyDiv=numCookies % numNeeded; //computes whether or not the number of cookies will divide evenly among the people
                                                                        //and whether there wil be any extra
                                                                        
                                    if (evenlyDiv == 0) {    // boolean expression to see whether the num of cookies divides evenly among the people
                                      System.out.println("You have enough cookies for each person and the amount will divide evenly"); //prints statement to user
                                       return;              //ends the program
                                    }
                                    else{                   //if the above if statement is not fulfilled, then....
                                         
                                         if ((numHave>0) && (evenlyDiv != 0)) { //checks to see if there is enough cookies for all the people, but that the number does not
                                                                                //divide evenly
                                         System.out.println("You have enough cookies for each person but the amount will not divide evenly:  "); //prints statement to user if statement is fulfilled
                                         return;                     //ends the program
                                         }          
                                        // if neither of the statements above are satisfied, then 
                                        else {      //the user does not have enough cookies
                                        System.out.println("You do not have enough cookies"); //prints statement to user
                                        return; //ends program
                                           }
                                       
                                    }
                            }
                                    
                            else{               //if an integer is not entered for the num of cookies per person
                             System.out.println("You did not enter an int"); //print statement to user
                             return; //end program
                             }     
                            }
    
                        else{                   //if an integer is not entered for the num of cookies 
                        System.out.println("You did not enter an int");  //print statement to user
                        return; //end program
                        }
                   }
              else{                     //if the integer entered for the num of people is less than or equal to zero
                    System.out.println("You did not enter an integer greater than zero"); //print statement to user
                    return; //end program
                     }
            }
            
            else{           //if an integer is not entered for the num of people
             System.out.println("You did not enter an int"); //print statement to user
             return;        //end program
                      }
}
}
        
        
 