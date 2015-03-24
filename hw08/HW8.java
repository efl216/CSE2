//Emily Levenson
//hw08 cs2
//March 20, 2015
//this program is a game that uses the main method provided, and incorporates other methods


import java.util.Scanner; 

public class HW8{ //define a class
public static void main(String[] args) { //add main method
        char option; 
        Scanner scan = new Scanner(System.in); //declare, instance, and constructs scanner object
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!"); 
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc"); //calls on the "getInput" function that uses the scanner and a string as inputs
        System.out.println("You are in a dead valley."); //
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //calls on the "getInput" function that uses the scanner and a string as inputs
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave(); //calls on the cave function
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-"); 
        input = getInput(scan, "Cc"); //calls on the "getInput" function that uses the scanner and a string as inputs
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //calls on the "getInput" function that uses the scanner and a string as inputs
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant(); //calls on the giant function
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10); //calls on the "getInput" function that uses the scanner, a string, and an int as inputs
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box(); //calls on the "box" function
        input = getInput(scan); // calls on the "getInput" function that uses the scanner as an inputs
        System.out.println("Hero! Have a good day!");
    }
    
     public static void giant() { //function that, when called on by the main method,  prints out the Giant
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void box(){ //function that, when called on by the main method,  prints out the three boxes
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

  public static void cave() { //function that, when called on by the main method, prints the cave
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
public static String getInput(Scanner scan, String string){ //getInput function that uses the scanner and a string as inputs and returns a string as output
     String statement=""; //initialize the variable
     statement=scan.next(); //assign the user's input to a variable
    if(!(string.contains(statement))){ //checks to see if the user input matches the string that is inputted in the main method ("Cc"). If not
         System.out.println("game over!"); //print game over
         System.exit(0); //exit the game
    }
    return ""; //if the user did enter a C or c, then the function returns back to the main method to continue the game
}

public static String getInput(Scanner scan, String string, int trial){ //getInput function that uses the Scanner, a string, and an integer as input and returns a string as output
    string=scan.next(); //assigns the user input to a variable
    int i=1; //initializes the while loop
    String str=" "; //initializes the return string
      while(i<trial){ //loop to run continuosly until i is less than the trial number (10).
        if("A".equals(string) || "a".equals(string)){  //loop runs only if user entered an A or a
          double num=  (Math.random()*1); //random number is generated from 0-.999
          if (num<0.5){ //if the random number is less than 0.5 (logically the same probability of obtaining a 0 or a 1 out of two numbers:0 and 1)
             
              System.out.println("Gosh how could you miss it?!"); //print the miss
              System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD"); //prompt user
             // System.out.println(i);    
              string=scan.next(); //takes next user input and proceeds through the method. (if A or a, while loop begins again, if E or e, skip while loop)
              
                   
          }
          else { //if the number generated is >=0.5 
              System.out.println("Great hit!!!"); //print the hit
              System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD"); //prompt user
         //  System.out.println(i); 
          string=scan.next(); //store next user input and proceed again
          i++;  //incremements the while loop counter ONLY when a hit is made
           }
       }
       else{ 
           if("E".equals(string) || "e".equals(string)){ //if E or e is entered by user
               int num= (int) (Math.random()*10)+1; // generates a random int from 0-10
               if(num==10){ //if the number generated is equal to 10
                   System.out.println("Congrats, you escaped!!!"); //print to user 
                   break; //breaks out of if statement in the method and continues in the method
               }
               else{
                   System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    string=scan.next();     //assigns input to a variable          
                   
               }
           }
           else { //if neither an A or a, or E or e is entered by user, by default, the game will end
               System.out.println("Executed by the Giant..GAME OVER!"); 
               System.exit(0); //exit the entire program
           }
       }
    }
System.out.println("Great hit!!!"); //prints when the 10th hit is made
return str; //returns empty string to get back to the main method
}


public static String getInput(Scanner scan){ //method that takes the scanner as input and returns a string
    System.out.println("Choose either box 1, 2 or 3 to get your treasure"); //prompts user
    int boxNum=scan.nextInt(); //assigns user input to variable
    String reward=""; //initializes the reward statement
    switch (boxNum){ //begins switch statement for the box number 
        case 1: //if user enters a 1
            System.out.println("HOLY CRAP YOU JUST WON A MILLION DOLLARS!!!!"); //prints reward
            break; //breaks out of switch statement
        case 2:// if user enters a 2
            System.out.println("CONGRATS! YOU WON A FREE TRIP TO HAWAII!!!!"); //prints reward
            break; //breaks out of switch statement
        case 3: //if user enters a 3
            System.out.println("OMG YOU JUST WON A LARGE CHEESE PIZZA WITH 3 EXTRA TOPPINGS!!"); //prints reward
            break; //breaks out of switch statement
        default: //if user enters a number other than 1, 2, or 3. 
            System.out.println("A Wrong Number! You get nothing! Better restart the game LOL"); //prints statement
            System.exit(0); //exits the program
    }
return reward; //returns the reward string
}

}
