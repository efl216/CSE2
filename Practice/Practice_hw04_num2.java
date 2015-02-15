//Emily Levenson
//February 13, 2015
//cse2 hw04
//WhichNumber --> Program that prompts the user to enter an integer between 1-10 (inclusive)
//Then the program asks the user questions in an attempt to guess what number the user is thinking of.

//import the scanner class
import java.util.Scanner;

//add the Cookies class
public class Practice_hw04_num2{
    //add the main method
    public static void main(String[] args){
        //declare an instance of Scanner object, and call Scanner contructor. 
        //tells Scanner that I am creating an instance that will take input from 
        //STDIN
        Scanner myScanner = new Scanner(System.in);

 
 System.out.print("Enter a number between 1 and 10, inclusive");
        //checks to make sure the number inputted is an integer
        if (myScanner.hasNext()) { //checks to make sure an int is entered
          int number= myScanner.nextInt(); //assigns the int to a variable
          System.out.print("Is the number even?");
          String choice1=myScanner.next();
            if(choice1.equalsIgnoreCase("y")) {
                System.out.print("Is it divisble by 3? ");
                String choice2=myScanner.next();
                if (choice2.equalsIgnoreCase("y")) {
                    System.out.println("Your number is 6");
                    return;
                }
                else {
                    if (choice2.equalsIgnoreCase("n")) {
                        System.out.println("Is your number divisble by 4? ");
                        String choice3=myScanner.next();
                            if(choice3.equalsIgnoreCase("y")) {
                                System.out.print("Is the number divided by 4 greater than one? ");
                                String choice4=myScanner.next();
                                    if(choice4.equalsIgnoreCase("y"))  {
                                        System.out.println("your number is 8");
                                        return;
                                    }
                                    else {
                                        if(choice4.equalsIgnoreCase("n")) {
                                            System.out.println("Your number is 4");
                                            return;
                                        }
                                        else {
                                            System.out.println("Invalid Input");
                                            return;
                                        }
                                    }
                                
                            }
                            else {
                                if(choice3.equalsIgnoreCase("n")) {
                                    System.out.println("Is your number divisible by 5?");
                                    String choice5=myScanner.next();
                                    if(choice5.equalsIgnoreCase("y")) {
                                        System.out.println("Your number is 10");
                                        return;
                                    }
                                    else {
                                        if(choice5.equalsIgnoreCase("n")) {
                                            System.out.println("Your number is 2");
                                            return;
                                        }
                                        else{
                                            System.out.println("Invalid Input");
                                            return;
                                        }
                                    }
                                    
                                }
                                else {
                                    System.out.println("Invalid Input");
                                    return;
                                }
                            }
                    }
                    else {
                        System.out.println("Invalid Input");
                        return;
                    }
                }
                
            }
            
            //NOW TEST FOR ODD //
            
            else {
                if (choice1.equalsIgnoreCase("n")) {
                    System.out.println("Is it divisible by 3?");
                    String choice6=myScanner.next();
                        if(choice6.equalsIgnoreCase("y")) {
                            System.out.println("When divided by 3, is the result greater than 1?");
                            String choice7=myScanner.next();
                                if(choice7.equalsIgnoreCase("y")) {
                                    System.out.println("Your number is 9");
                                    return;
                                }
                                else {
                                    if (choice7.equalsIgnoreCase("n")) {
                                        System.out.println("The number is 3");
                                        return;
                                    }
                                    else {
                                        System.out.println("Invalid Input");
                                        return;
                                    }
                                }
                            
                        }
                        else {
                            if(choice6.equalsIgnoreCase("n")) {
                                System.out.print("Is it greater than 6?");
                                String choice8=myScanner.next();
                                    if (choice8.equalsIgnoreCase("y")) {
                                        System.out.println("The number is 7");
                                        return;
                                    }
                                    else {
                                        if (choice8.equalsIgnoreCase("n")) {
                                            System.out.println("Is it less than 3?");
                                            String choice9=myScanner.next();
                                                if (choice9.equalsIgnoreCase("y")) {
                                                    System.out.println("The number is 1");
                                                    return;
                                                }
                                                else {
                                                    if (choice9.equalsIgnoreCase("n")) {
                                                        System.out.println("The number is 5");
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("Invalid Input");
                                                    }
                                                }
                                        }
                                        else {
                                            System.out.println("Invalid Statement");
                                            return;
                                        }
                                    }
                            }
                            else{
                                System.out.println("Invalid Input");
                                return;
                            }
                        }
                    
                }
                else {
                    System.out.println("Invalid input");
                }
            }  
            
            
            
            
            
            
            
            
            
        }
        
        else{
            System.out.println("invalid input");
            return;
        }
        
    }
}