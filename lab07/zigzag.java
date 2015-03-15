//Emily Levenson
//cse02 lab6
//This lab will utilize loops in order to make a zigzap pattern using the number
//the user inputs as the length of the zag

import java.util.Scanner; //import scanner object
//define a class
public class zigzag{
    public static void main(String[] args){ //add main method
       
     System.out.println("----------Part 1---------");  
       
       for (int l=1; l<=10;l++){ //for loop to create a line of 10 stars
        System.out.print("*"); //prints one star on each lime each time it goes through the loop 
           
           
           
       }
       System.out.println(); //starts a new line
       
       
       System.out.println("----------Part 2---------");
        int nStars=10; //initialize number of stars
        for (int i=1; i<=10;i++){ //outer loop to control the inner loop
            for(int j=0; j<i; j++){ //inner loop that prints the number of spaces
                System.out.print(" "); //prints spaces on each line as long as the inner loop counter is less than the outer loop counter
                }
                System.out.print("*\n"); //prints one star on each line following the space(s)
            }
        System.out.println(); //starts new line
        
        System.out.println("---------PART 3---------");
        nStars=-1; //iniatlize the nStars variable
        System.out.println("enter an integer between 3 and 33"); //prompts user to enter a number
        Scanner myScanner = new Scanner(System.in); //scanner accepts input
        
         boolean runLoop=true; //sets up boolean to run an infinite loop
          
          while(runLoop){ //    begin infinite loop
            while(!myScanner.hasNextInt()) { //makes sure input is an integer
            System.out.println("please enter an integer"); //if not, prompt user an error message
            myScanner.next(); //clears command line
            }
     
              
            nStars = myScanner.nextInt(); //stores user input into variable
            while(nStars<=3 || nStars>=33){ //makes sure int is in the range
            System.out.println("please enter a valid number [3,33]"); //if not, prompt user an error message
            nStars=myScanner.nextInt(); //clears command line
            }
          ///this is where you write code to control the stars
          int zigLength=nStars-2;//this is the length of the zag
          String firstRow=""; //initialize first row of stars
          for(int counter=0; counter<nStars; counter++){ //for loop to print the first line of stars
            System.out.print("*"); //prints the stars
          }
        System.out.println(); //prints new line
        
        for (int i=1; i<=zigLength;i++){ //outer loop to control inner loop
            for(int counter=0; counter<i; counter++){ //inner loop to print the diagonal of stars
            System.out.print(" "); //prints spaces in a diagonal
                }
                System.out.print("*\n"); //prints stars at the end of spaces
        }
          for(int counter=0; counter<nStars; counter++){ //loop to print the last row of stars
            System.out.print("*"); //prints the star
          } 
        System.out.println(); //print on new line

//Loop to control whether the program will run again
          System.out.println("Enter y or Y if you would like to run again"); //prompt user
            String runAgain=myScanner.next(); //store input
            if (runAgain.equals("y") || runAgain.equals("Y")){ //check to see what user inputted
               System.out.println("Enter a number in the range: [3,33]"); //if they said yes, run loop again
               
            }
            else{ //if user said no, 
                break; //exit loop
            }
          } 
          
    }
}