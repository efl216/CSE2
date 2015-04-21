 //EMily Levenson
 //Cse002
 //April 6, 2015
 //Remove Elements Program....
 /// This program creates an array of random integers from 1-9, and then filters the array based on the specifications identified by the user. 

 
  
  import java.util.Random; 
  import java.util.Scanner;
  
  
  public class RemoveElements{ //define a class
    public static void main(String [] arg){ //add main method
  	Scanner scan=new Scanner(System.in); ////declare, instance, and constructs scanner object
  int num[]=new int[10]; //initialize number array
  int newArray1[]; //declare a new array
  int newArray2[]; //declare a second new array
  int index,target; //declare variables
  	String answer=""; //initialize the answer
  	do{ //do while loop
    	System.out.println("Random input 10 ints [0-9]"); //print statement
    	num = randomInput(); //calls method that produces an array of 10 random ints
    	String out = "The original array is:"; //spring the output
    	out += listArray(num); //assigns out to the array of random ints
    	System.out.println(out); //prints the output array
   
    	System.out.print("Enter the index "); //prompts user
    	index = scan.nextInt(); //assigns user input to the index value
    	newArray1 = delete(num,index); //assigns the filtered array to newArray 1
    	String out1="The output array is "; 
    	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
    	System.out.println(out1);
   
      System.out.print("Enter the target value ");
    	target = scan.nextInt();
    	newArray2 = remove(num,target);
    	String out2="The output array is ";
    	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
    	System.out.println(out2);
    	 
    	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-"); 
    	answer=scan.next();
  	}while(answer.equals("Y") || answer.equals("y"));
    }
   
    public static String listArray(int num[]){ //prints the new array
  	String out="{";
  	for(int j=0;j<num.length;j++){
    	if(j>0){
      	out+=", ";
    	}
    	out+=num[j];
  	}
  	out+="} ";
  	return out;
    }
  
  
   public static int[] delete(int[] inArray, int index){ //method that deletes the index value that the user specifies
       int outArray[]=new int[inArray.length-1]; //initializes the new output array to have legnth one less than input Array
       int j=0; //initialize counter
       for (int i=0; i<inArray.length; i++){ //checks each value in the input array
           if (i==index){ //when the loop reaches the target index, it will skip this index 
             continue; //goes back to top of loop with completing the rest of the loop
           }
           outArray[j]=inArray[i]; //assigns each value in input array to output array, except that of the index
           j++; //incrememnt the j counter
           } 
       return outArray; //return the output array to main method
       }
       
 
   
  
   public static int[] randomInput(){ //this method generates 10 values in the array composed of random integers
       Random randomGenerator = new Random(); //declares, instance, and construct random generator
       int outArray2[]=new int[10]; //initialize the outarray to have length of 10
       for (int i=0; i<10; i++){ //sets up loop to add one random integer to every index of the output array
           outArray2[i]=randomGenerator.nextInt(10); //generates random int
       }
       return outArray2; //returns the output array to the main method
   }
   
   public static int[] remove(int[] inArray, int value){ //method filters the input array to contain all numbers except those identified by the user
       int k=0; //initialize the counter
       for (int i=0; i<inArray.length;i++){ //begin loop to determine how many values of input array match the value specificed by user
           if (inArray[i]==value){ //if an integer in the input array contains the "value" specified by user. 
               k++; //incremement k
           }
       }
        int[] outArray3=new int[inArray.length-k]; //initializes the output array to contain the number of values as the input array, minus the 
                                                   //number of times the inarray contains the "value" specified by user
       
       int l=0; //initialize counter
       for (int j=0; j<inArray.length; j++){ //begin loop to run through each index of input array
           if(inArray[j]!=value){ //if the input array does not contain the value sepcified by the user
               outArray3[l]=inArray[j]; //then set that index value equal to the same index value of the output array
                l++; //increment the counter for the output array
           }
          
       }
     
       return outArray3; //returns output array to main method. 
   }
   
  }