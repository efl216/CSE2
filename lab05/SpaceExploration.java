//Emily Levenson
//Feb 18 2015
//cse02 lab05
//Space Exploration Program
// This program will generate a timeline of space exploration advances that occured from
//2000-2010.
//A random year will be generated from 2000 to 2010 and the program will print all the advances
//that occured from 2000 up to the random year. 

//define a class
public class SpaceExploration{
   //add main method 
    public static void main(String[] args){
    int year=(int) (Math.random()*11)+2000; //generates a random year where 11 is the upperbound +1 and 2000 is the lower bound
    System.out.println("Here is a timeline of space exploration events from "+year+" to 2000"); //Prints the header
    switch(year){ //initializes the switch statements
      
//------------------------The program goes to whichever "case" the random number generater generated. Then it prints that case as well as the cases 
//------------------------in years prior to that case----------------------------------
        case 2010:  
            System.out.println("2010:SpaceX sucessfully sends spacecraft to orbit and back");
        
        case 2009:
            System.out.println("2009: N/A");
        
        case 2008:
            System.out.println("2008: Kepler launched to study deep space");
        
        case 2007:
            System.out.println("2007: N/A");
        
        case 2006:
            System.out.println("2006: Spacecraft returns with collections from a comet");
        
        case 2005:
            System.out.println("2005: Spacecraft collies with comet");
            
        case 2004:
            System.out.println("2004: N/A");
            
        case 2003:
            System.out.println("2003: Largest infrared telescope released");
            
        case 2001:
            System.out.println("2001: First spacecraft lands on asetoid");
         
        case 2000:
            System.out.println("2000: First spacecraft orbits an asteroid");
            break; //end switch statement
            
        } //closes switch statements
        
        
    } //closes main method
} //closes the class