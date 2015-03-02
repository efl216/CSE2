//Emily Levenson
//cse2 hw06
//MakeSymbols.java- a program that utilizes do loops and the random number generator to generate an integer
//between 0 and 100 and prints out that number of * characters or & characters based on 
//whether the number is even or odd.

//define the class
public class MakeSymbols{
    //add main method
    public static void main(String[] args){
        
        
        int counter=1; //initiatilize the counter for all loops
        int num= (int)(Math.random()*100); //generate random number from 0-100
        String even=""; //initialize the string for even numbers
        System.out.println("Random number generated: "+num); //print the random number
     
//----------------------EVEN NUMBERS--------------------------------------------------------//     
        if (num%2==0 && num!=0){ //if the random number is even (and not zero)
          
            do { //go through this loop
                even+="*"; //where an '*' character is added to a string until the number of * = the random number generated
                counter++; //increment the counter
            }
            while(counter<=num); //go through the loop above until the counter reaches the random number generated
            System.out.println("Output pattern: "+even); //print the output string of '*' characters
        }
        
//------------------------ODD NUMBERS-------------------------------------------------------//        
        String odd=""; //Initialize the odd string
        if(num%2!=0){ //check to see if the number is odd
            do{ //if odd, then add a & to a string until the number of &'s reaches the random number value
                odd+="&"; //adds the & symbol each time loop runs through
                counter++; //increment the counter
            }
            while(counter<=num); //go the the loop until the counter reaches the random number generated
            System.out.println("Output pattern: "+odd); //print the output string of '&' characters
        }
        
        
        String zero=""; //initialize the string for zero
        if(num==0){ //if the random number generated is zero
            System.out.println("Output Pattern: "); //print the blank output pattern
            }
        
        
        
        
        
        
        
    }
}