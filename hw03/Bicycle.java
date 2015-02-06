
////Emily Levenson
//February 6, 2015
//cse2 hw03
//This program will compute the distance traveled and average miles per hour of a biker after  
//the user inputs the number of counts on a cyclometer and the seconds during which the counts occured


import java.util.Scanner; //import the scanner class

//define a class
public class Bicycle {
    //add a main method
    public static void main(String[] args) {
        Scanner myScanner; //declare and instance of the scanner object
        
         myScanner=new Scanner (System.in); //construct the scanner object
    
        System.out.print("Enter the number of counts of the cyclometer: "); //prompts the user
        int counts = myScanner.nextInt(); //accepts the user input 
        System.out.print("Enter the number of seconds during which the count occured: "); //prompts the user
        int seconds=myScanner.nextInt(); //accepts the user input
        
       //declare and assign constants
       double wheelDiameter=27.0;
       int feetPerMile=5280;
       double pi=3.141592;
       //computations
       double totalDistance=((wheelDiameter*pi* (double) counts)/12)/5280; //computes total distance traveled
       totalDistance=totalDistance*100; //
       int totalDistanceInt= (int) totalDistance;
       double totalDistanceDoub= (double) totalDistanceInt/100;
       double totalTime= (double) seconds/60; //computes total time in minutes
       totalTime=totalTime*100;
       int totalTimeInt= (int) totalTime;
       double totalTimeDoub= (double) totalTimeInt/100;
       double totalTimeHrs=totalTime/60;
       
       double speed= totalDistance/totalTimeHrs;
       speed=speed*100;
       int speedInt= (int) speed;
       double speedDoub= (double) speedInt/100;
       
       //display results
       System.out.println("The distance was "+totalDistanceDoub+" miles and took "+totalTimeDoub+" minutes.");
       System.out.println("The average mph is "+speedDoub+"");
       
    }
}
       