//Emily Levenson
//February 13, 2015
//cse2 hw04
//WhichNumber --> Program that prompts the user to enter an integer between 1-10 (inclusive)
//Then the program asks the user questions in an attempt to guess what number the user is thinking of.

//import the scanner class
import java.util.Scanner;

//add the Cookies class
public class WhichNumber{
    //add the main method
    public static void main(String[] args){
        //declare an instance of Scanner object, and call Scanner contructor. 
        //tells Scanner that I am creating an instance that will take input from 
        //STDIN
        Scanner myScanner = new Scanner(System.in);

 
 System.out.print("Enter a number between 1 and 10, inclusive: ");
        //checks to make sure the number inputted is an integer
        if (myScanner.hasNext()) { //checks to make sure an int is entered
          int number= myScanner.nextInt(); //assigns the int to a variable
          System.out.print("Is the number even? ");  //prompts the user to say whether the num is even
          String choice1=myScanner.next(); //assigns the user input to variable
          
          
//----------------If the number is even--------------------------///          
          
            if(choice1.equalsIgnoreCase("y")) { //if the number is even
                System.out.print("Is it divisble by 3? ");  //ask if its divisible by three
                String choice2=myScanner.next(); //assign this input to a variable
                if (choice2.equalsIgnoreCase("y")) { //if the num is divisible by three
                    System.out.println("Your number is 6"); //print the number 6 to the screen
                    return; //end the program
                }
                else {
                    if (choice2.equalsIgnoreCase("n")) { //if the number is not divisible by 3
                        System.out.println("Is your number divisble by 4? "); //ask if it is divisible by 4
                        String choice3=myScanner.next(); //assign user input to a variable
                        
                        //----------------Number is divisible by four---------------------------------------//
                        
                            if(choice3.equalsIgnoreCase("y")) { //if the number is divisible by 4
                                System.out.print("Is the number divided by 4 greater than one? "); //ask user if its solution is greater than one
                                String choice4=myScanner.next(); //assign the user input to a variable
                                    if(choice4.equalsIgnoreCase("y"))  { //if the solution is greater than one 
                                        System.out.println("your number is 8"); //print the number 8
                                        return; //end the program
                                    }
                                    else {
                                        if(choice4.equalsIgnoreCase("n")) { //if the number is not greater than 1 when divided by 4
                                            System.out.println("Your number is 4"); //print the number 4
                                            return;     //end the program
                                        }
                                        else { //if the user did not enter a 'y' or 'n'
                                            System.out.println("Invalid Input"); //print error statement
                                            return; //end the program
                                        }
                                    }
                                
                            }
                            //------------------Number NOT divisible by 4--------------------------------//
                            
                            else {  
                                if(choice3.equalsIgnoreCase("n")) { //if the number is not divisible by four
                                    System.out.println("Is your number divisible by 5? "); //ask user if it is divisible by 5
                                    String choice5=myScanner.next(); //assign user input to a variable
                                    if(choice5.equalsIgnoreCase("y")) { //if the number is divisible by 5
                                        System.out.println("Your number is 10"); //print the number 10
                                        return; //end program
                                    }
                                    else { 
                                        if(choice5.equalsIgnoreCase("n")) { //if the number is not divisible by 5
                                            System.out.println("Your number is 2"); //print the number 2
                                            return; //end program
                                        }
                                        else{ //if the user did not enter 'y' or 'n'//
                                            System.out.println("Invalid Input"); //Print error statement
                                            return; //end program 
                                        }
                                    }
                                    
                                }
                                else { //if the user did not enter a 'y' or 'n' after being asked if the number is divisible by four
                                    System.out.println("Invalid Input"); //print error statement
                                    return; //end program
                                }
                            }
                    }
                    else { //if the user did not input 'y' or 'n' after being asked if the number is divisible by 3
                        System.out.println("Invalid Input"); //print error statement
                        return; //end program 
                    }
                }
                
            }
            
            //-------------------TEST FOR ODD------------------------------------------------ //
            
            else {
                if (choice1.equalsIgnoreCase("n")) { //if the number is pdd
                    System.out.println("Is it divisible by 3?"); //ask if it is divisible by 3
                    String choice6=myScanner.next(); //assign user input to variable
                        if(choice6.equalsIgnoreCase("y")) { //if it is divisible by 3
                            System.out.println("When divided by 3, is the result greater than 1?"); //ask a follow up question
                            String choice7=myScanner.next(); //store input to variable
                                if(choice7.equalsIgnoreCase("y")) { //if the follow up question is yes
                                    System.out.println("Your number is 9"); //the number is 9
                                    return;
                                }
                                else {
                                    if (choice7.equalsIgnoreCase("n")) { //if the follow up question is no
                                        System.out.println("The number is 3"); //the number is three
                                        return;
                                    }
                                    else { //if the user does not input 'y' or 'n' to the follow up question, 
                                        System.out.println("Invalid Input"); //print error statement
                                        return; //end program
                                    }
                                }
                            
                        }
                        else { //if the odd number is not divisible by 3
                            if(choice6.equalsIgnoreCase("n")) { 
                                System.out.print("Is it greater than 6?"); //ask if it is greater than 6
                                String choice8=myScanner.next(); //store input to variable
                                    if (choice8.equalsIgnoreCase("y")) { //if it is greater than 6
                                        System.out.println("The number is 7"); //the number is 7
                                        return; //end program
                                    }
                                    else { //if the number is not greater than 6
                                        if (choice8.equalsIgnoreCase("n")) {
                                            System.out.println("Is it less than 3?"); //ask if it is less than 3
                                            String choice9=myScanner.next(); //assign input to variable
                                                if (choice9.equalsIgnoreCase("y")) { //if is is less than 3
                                                    System.out.println("The number is 1"); //the number is 1
                                                    return; //end program
                                                }
                                                else { //if the num is not less than 3
                                                    if (choice9.equalsIgnoreCase("n")) {
                                                        System.out.println("The number is 5"); //print the number is 5
                                                        return; //end program
                                                    }
                                                    else { //if the user did not enter a valid input
                                                        System.out.println("Invalid Input"); //error message
                                                    }
                                                }
                                        }
                                        else { //if the user did not enter a valid input
                                            System.out.println("Invalid Statement"); //error message
                                            return; //end
                                        }
                                    }
                            }
                            else{ //if user did not enter a valid input
                                 System.out.println("Invalid Input"); //error message
                                return; //end 
                            }
                        }
                    
                }
                else { //if the user did not enter a valid input 
                    System.out.println("Invalid input"); //error message
                }
            }  
            
            
            
            
            
            
            
            
            
        }
        
        else{ //if the user did not enter an integer 
            System.out.println("invalid input"); //error message
            return;
        }
        
    }
}