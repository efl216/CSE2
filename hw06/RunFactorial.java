//Emily Levenson
//CSE02 Hw6
//Feb 25 2015
//RunFactorial is a program that generates the factorial of the number inputed by the user

//import the Scanner object
import java.util.Scanner;

//define a class
public class RunFactorial{
    public static void main(String[] args){ //add main method
        
        //declare instance and construct scanner object
        Scanner myScanner=new Scanner(System.in); 
        long factorial=1; //declare and initialize the factorial value
        System.out.println("Enter an int between 9 and 16 "); //prompt user
        int t=0;
        while(!myScanner.hasNextLong()) { //makes sure input is a long
            System.out.println("please enter a valid number"); //if not, prompt user an error message
            myScanner.next(); //clears command line
        }
        
        long num=myScanner.nextLong(); //store user input 
                int counter=1; //initialize the counter
                 while (counter<=num){ //starts the loop and runs through until the counter reaches the users number
                    if (num>=9 && num<=16) { //only runs through loop if user inputted valid number
                       factorial*=counter; //computes the factorial
                       ++counter; //increments the counter
                    }
            
                    else { //if the user did not enter a number in the correct range
                    
                         System.out.println("Enter a Valid Number"); //prompt error message
                          
                        // myScanner.next();
                          long num2=myScanner.nextLong(); // //stores valid number into a variable
                           if (num2>=9 && num2<=16){ //checks to make sure that number is valud
                                 while (counter<=num2){ //if it is valid, the loop runs until the counter reaches the new number
                    
                                   factorial*=counter; //computes the factorial
                                    ++counter; //increments the counter
                                 } 
                            }
                    }
                }
        
     
        System.out.println(""+factorial); //prints the factorial
          
            

    }
}

        