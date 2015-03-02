//Emily Levenson
//CSE02 Hw6
//Feb 25 2015
//GetIntegers is a program that asks the user for 5 different integers and computes the sum of them 
//using non-nested for-loops
//import the scanner class
import java.util.Scanner;

//define a class
public class GetIntegers{
    //add main method
    public static void main(String[] args){

         //declare and construct the scanner object
         Scanner myScanner=new Scanner(System.in);    
        //declare and initialize the sum of the 5 numbers
        int sum;
        sum=0;
        int num2=0;
            //prompt the user
            System.out.println("Enter 5 non negative numbers   ");
            for (int i = 1; i <= 5; i++) { //create a loop that runs through 5 times
                    if(myScanner.hasNextInt()){ //checks to make sure next user input is an 
                        int num=myScanner.nextInt(); //assigns the integer to a variable
                        if(num>=0){ //makes sure int is greater than zero
                           sum=sum+num; //computes the sum
                        }
                        else { //if a negative integer is inputted
                             System.out.println("Enter a positive number pulease ");  //prints error message
                             i=i-1; //removes the invalid input from the counter
                        }

                    }
                    else { //if the input is not an integer
                        i=i-1; 
                        System.out.println("Enter a valid number "); //prompts user to enter a valid number
                        myScanner.next(); 
                                }


                        }

System.out.println("Sum="+sum); //prints the sum

}  

}