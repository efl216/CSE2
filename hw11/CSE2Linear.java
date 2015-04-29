//Emily Levenson
//cse 002, hw11
//this program asks the user to insert 15 grades of cse students. The program then sorts the array to contain grades in ascending order, then searches the array
//binarily to find a specific student's grade, Next, the program scrambles the array members, and searches linearly to find a specific student's grade.
//April 12, 2015


import java.util.Scanner; 
import java.util.Random;
public class CSE2Linear{ //define a class
public static void main(String[] args) { //add main method

Scanner myScan = new Scanner(System.in); //declare, instance, and constructs scanner object
System.out.println("Enter 15 ints for students' final grades in CSE2: "); //prompt user
int [] grades=new int[15]; //initialize array
for (int i=0; i<grades.length; i++){ //begin loop to assign each array index to a grade
    
   while(!myScan.hasNextInt()){ //prompt user to enter only integers
       System.out.println("please enter integers only");
        myScan.next();
   }
       int num=myScan.nextInt();
       while (num<0 || num>100){ //prompt user to enter grades only in the proper range
           System.out.println("The students grade must be in the range from 0-100");
             while(!myScan.hasNextInt()){ //prompt user to enter only integers
                System.out.println("please enter integers only");
                myScan.next();
             }
 
           num=myScan.nextInt();
       }
       grades[i]=num; //assign each array index to a value
   }
   System.out.println(printArray(grades)); //print array
  
  sort(grades); //calls on sorting method which sorts grades in ascending order
  int [] sortGrades=grades; //assign the sorted array to new variable
  System.out.println("Enter a student's grade to be searched for: "); //prompt user
  search(sortGrades); //calls on method that searches array (binarily) for a specific number
  printScramble(sortGrades); //calls on method that scrambles the sorted array
  int [] scrambleGrades=sortGrades; //assigns the scrambled array to a new variable
 
  System.out.println("Enter a student's grade to be searched for: "); //prompt user for another grade
  linear(scrambleGrades); //calls on method which searches (linearly) for the specific grade entered by user

 
}




public static String printArray(int[] array){ //this method prints the arrays
     String print="{";
  	for(int k=0; k<array.length; k++){
    	if(k>0){
      	print+=", ";
    	}
    	print+=array[k];
  	}
  	print+="} ";

  return print;
  	
}

public static void printScramble(int[] array){ //this method scrambles the array and prints it
    Random randomGenerator = new Random(); //declares, instance, and construct random generator
    for (int i=0; i<array.length; i++){ //for each index in the array
       int j=randomGenerator.nextInt(15); //generates a random integer from 0-14
       int temp=array[i]; //assigns the value of each array index to a temp variable
        array[i]=array[j]; //sets the value of each index from original array to a random index in the new array
        array[j]=temp; 
    }
     String print="The scrambled array is: {"; //the following code prints the scrambled array
  	for(int k=0; k<array.length; k++){
    	if(k>0){
      	print+=", ";
    	}
    	print+=array[k];
  	}
  	print+="} ";
  	System.out.println(print); 
}









public static void sort(int [] array){ //this method sorts the array in ascending order, it works examining each member of array one by one, and seeing if 
    int temp;                           //the preceding member is less than the current member. 
    for (int i=0; i<array.length-1; i++){ 
        for (int j=i+1; j<array.length; j++){
            if (array[i]>array[j]){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
    }
   String print="The sorted array is: {"; //prints the sorted array
  	for(int k=0; k<array.length; k++){
    	if(k>0){
      	print+=", ";
    	}
    	print+=array[k];
  	}
  	print+="} ";
  	System.out.println(print);
}

public static void search(int[] array){ //this method searches for the desired grade inputted by user using a binary search
    Scanner myScan=new Scanner(System.in); 
    int key=myScan.nextInt(); 
    int high=14; //assigns the upperlimit to a variable
    int low=0; //assigns the lowerlimit to a variable
    int position=(high+low)/2; //calculates the half way point of array
    int counter=1; //counter to track the number of iterations
    while ((array[position]!=key) && (low<=high)){ //while the center array member is not equal to the value, and the lower limit is less than the upperlimit, 
        if (array[position]>key){ //the upper or lower limits change depending on whether the value is greater or less than the value of the center member
            high=position-1;
        }
        else{
            low=position+1;
        }
       // System.out.println(position);
        position=(high+low)/2; //the center member is dynamically changing for each iteration of the loop
        counter++; 
    }
        if (high>=low){
            int index=position+1;
            System.out.println(key+" was found at index " +index);
            System.out.println("There were/was " +counter+ " iterations");
        }
        else{
            System.out.println("The grade was not found");
            System.out.println("There were " +counter+ " iterations");
        }
        
    }
public static void linear(int [] array){ //this method searches for the member of the array that matches the grade inputted by the user in a linear fashion
     Scanner myScan=new Scanner(System.in); 
     int key=myScan.nextInt(); 
     int j=0;
     for (j=0;j<array.length; j++){ //for loop to check each member of the array, starting from index 0.
           if (array[j]==key){
              System.out.println(key+" was found in the list with "+(j+1)+ " iterations.");
              break;
           
           }
           
           
     }
  
}       



}













