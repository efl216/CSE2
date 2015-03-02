//Emily Levenson
//smileyface program
//February 27 2015
//lab06


//define a class
public class SmileGenerator{ 
    
    //add a main method
	public static void main(String[] args){
	    
	    
//-------FOR LOOP--------//	
	int counter=1;  //counter for the loop
	String smile=" "; //initialize the string
	for (counter=1;counter<=5;counter++){ //will run through the loop 5 times
	     smile += ":)"; //will add a smile to the string for each loop
	     
	  }
     System.out.println(""+smile); //print the total string after the loop runs all 5 times
	 
	 
//-------WHILE LOOP--------------------//	 
	 
	 
	 counter=1; //initialize the counter
	 String smile2=" "; //initialize the string
	 while (counter<=5) { //will run through the loop 5 times
	 smile2 += ":)"; //add a smile to the string during each run through the loop
	 counter++; //increment the counter
	 }
	 
	 System.out.println(""+smile2); //print the total string

//----------DO WHILE LOOP----------------//
    counter=1; //initialize the counter
    String smile3=" "; //initialize the string
    do { //tells compiler to do the following statement
        smile3+=":)"; //add a smile for each run through the loop
        counter++;//increment the counter
    }
        while(counter<=5); //do the preceding statements until the counter reaches 6
    System.out.println(""+smile3); //print the total string

//---------RANDOM NUMBER OF SMILEY FACES----------//

int num=(int) ((Math.random()*100)+1); //generate a random number of smileys
System.out.println(""+num); //print the random number
int counter2=1; //initialize the counter
String smile4=" "; //initialize the string
    for(counter2=1;counter2<=num;counter2++){ //loop that runs through the "random number" of times
      smile4+=":)"; //adds the random number of smileys to the string
    }
    
//--------BREAK UP STRING INTO LINES OF 30 SMILEY FACES-------//
    int counter3=1; //initialize counter
    int lines=(int)(num/30); //determine how many lines will be needed
     for(counter3=1;counter3<=lines;counter3++){ //loops that prints out 30 smiley faces for each line needed
     System.out.println(" :):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)");
     }
     
//--------ADD THE REMAINING SMILEY FACES-------------//     
     int counter4=1; //initialize counter
     int extra=(int)(num%30); //computes the "left over " smiley faces 
     String smile5=" "; //initialize the string
     
     for(counter4=1;counter4<=extra;counter4++){ //loop that adds one smiley to a string for each "left over smiley" that did not fit into the line of 30
        smile5+=":)";
     }
        System.out.println(smile5); //print left over smileys
  
 //-----------LOOP 4-> increases the number of smiley faces on each lineby one for every new line that is used----//
    int newLine=0; //initialize the variable 
    if(extra>0){ //if there are left over smiley faces that make up a new line
         newLine=1; //variable =1 (to be used in following step)
    }
    
    
        
    String smile6 = ""; //initialize the string
    for(counter3=1;counter3<=lines+newLine;counter3++){ //loop that runs for each line of smiley faces printed in previous print statements
       smile6+=":)"; //adds one smile to the string each time it runs through the loop
        System.out.println(smile6); //prints each line of the loop and creates a pyramid of smiley faces
    }
    
     




	}
}
