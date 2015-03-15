//Emily Levenson
//cse02 hw 07
//waves.java --> program to print out the integers in wave form. Program utilizes for loops, do while loops, and while loops.
//March 6, 2015

import java.util.Scanner;

public class waves{
    public static void main(String[] args){
        
System.out.println("----------FOR LOOP----------------------------"); 

        Scanner myScanner = new Scanner(System.in); //scanner accepts input
        System.out.println("Enter a number between 1 and 30, inclusive"); //prompts user
        while (!myScanner.hasNextInt()){ //checks to see if input is valid
            System.out.println("Enter an integer please"); //error message if not valid
            myScanner.next(); //removes input to accept new input
        }
        
        int num=myScanner.nextInt(); //stores valid input into variable
        while (num<1 || num>30){ //if the number is outside the proper range
            System.out.println("Please enter a number in the proper range [0,30]"); //prompts user
            num=myScanner.nextInt(); //removes input to accept a new input 
        }
        System.out.println("A proper number was entered"); //if a valid number is entered, this is printed
        
       
       
        for(int i=1; i<=num; i=i+1){ // i is the counter for the loop and it will run until i reaches the number the user inputted
            if(i%2==0){ //if the counter is even 
            for(int counter=0; counter<i; counter=counter+1){ //then print the number of rows for each 'i' value 
                for(int counter2=0; counter2<counter; counter2=counter2+1){ //and in each row, print the i digit in an incremented fashion
                   System.out.print(i); //prints the digit on each row from 1 to the number inputted
                }
                System.out.println(i); //prints the last digit on the row and then starts a new row
            }
           
        }
        else{ //if the counter 'i' is odd
            for(int counter=i; counter>=1; counter=counter-1){ //outer loop
                for(int counter2=counter; counter2>1; counter2=counter2-1){ //inner loop controlled by outer loop
                   System.out.print(i);  //prints the value of i a given number of times on each line
                }
                System.out.println(i); //prints the last i on each line 
            }
           
        
        }
        }
  
        System.out.println("----------USING WHILE LOOPS----------------");  
        
        System.out.println("Enter a number between 1 and 30, inclusive, to use in the while loop"); //prompt user
        while (!myScanner.hasNextInt()){ //check to see if input is valid
            System.out.println("Enter an integer please"); //if not valid, error message
            myScanner.next(); //clears command
        }
        
        int num2=myScanner.nextInt(); //stores number in variable
        while (num2<1 || num2>30){ //check number range
            System.out.println("Please enter a number in the proper range [0,30]"); //error message
            num2=myScanner.nextInt(); //clears command
        }
        System.out.println("A proper number was entered"); 
        
     
        int k=1;      //initialize loop
        while(k<=num2){ //while the counter is less than input value
            if(k%2==0){ //if the counter is even
                int counter4=0; //initialize inner loop
                while(counter4<k){ //run inner loop as long as counter is less than outer loop counter
                int counter5=0; //initializer inner-most loop
                    while(counter5<counter4){ //run innermost loop as long as counter is less than outer loop counter
                    System.out.print(k);  //print the outer most loop's counter value
                    counter5++; //increment innermost loop's counter
                }
                System.out.println(k); //print the out most loop's counter value and start new line
                counter4++; //increment middle loop's counter value
            }
            
        }
            else{ //if number is odd
            int counter=k; //initialize counter 
            while(counter>=1){ //condition the while loop 
               int counter2=counter; //initialize counter for innner loop
               counter=counter-1; //decrement the counter
               while(counter2>1){ //condition inner most while loop
                   System.out.print(k);  //print the k value on the same line for the number of times the loop runs
                   counter2=counter2-1; //decrement counter
                }
                System.out.println(k); //print the last k on each line
               
            }
        }
        k=k+1;   //incrememnt the outermost counter  
        }
        
  
    System.out.println("----------DO-WHILE LOOP---------------------"); 
    // the following section makes sure a proper input is entered
    System.out.println("Enter a number between 1 and 30, inclusive, to use in the do-while loop");
        while (!myScanner.hasNextInt()){
            System.out.println("Enter an integer please");
            myScanner.next();
            }
        
       num2=myScanner.nextInt();
       while (num2<1 || num2>30){
           System.out.println("Please enter a number in the proper range [0,30]");
           num=myScanner.nextInt();
        }
        System.out.println("A proper number was entered");
//---------------------------------------------------------------------------//    
     
         k=1; //initialize outer loop's counter
        do { //start the loop
            if(k%2==0){ //if the counter is an even number
                int counter4=0; //initialize counter for inner loop
                do{ //start inner loop
                    int counter5=0; //initialize counter for innermost loop
                     do{ //start innermost loop
                       System.out.print(k);  //print the outer loop's counter 
                       counter5++; //increment counter for innermost loop
                     } 
                     while(counter5<=counter4); //condition the inner most loop
                    System.out.println(""); //print a new line
                    counter4++; //incrememnt counter for middle loop
                }
                while(counter4<k); //condition the middle loop

        }
            else{ //if k is odd
              
            int counter=k; //initialize counter 
            do{ //start inner loop
               int counter2=counter; //initialize counter for innermost loop
               counter=counter-1; //decrememnt the inner loop's counter
                do{ //start the innermost loop 
                   System.out.print(k); //print the value k on a line
                    counter2=counter2-1; //decrement innermost loop's counter
                }
                while(counter2>=1);  //condition the innermost loop
                
                System.out.println(""); //starts a new line
            } 
            while(counter>=1);   //conditions the inner loop
         
        
        }
        k=k+1; //increments the outermost loop
        }
         while(k<=num2); //conditions the outermost loop
        
        
        
    }
}

