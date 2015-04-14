//Emily Levenson


import java.util.Random;
import java.util.Scanner;

public class Arrays{
public static void main(String[] args){
     int [] array1=new int[50];
     int [] array2=new int[50];
     Random randomGenerator = new Random(); //declares, instance, and construct random generator
     for (int i=0; i<array1.length; i++){ //sets up loop to add one random integer to every index of the output array
          array1[i]=randomGenerator.nextInt(101); //generates random int
       }
    String out="{";
  	for(int k=0;k<array1.length;k++){
    	if(k>0){
      	out+=", ";
    	}
    	out+=array1[k];
  	}
  	out+="} ";
  	System.out.println(out);
       
       int min=array1[0];
       for (int j=0;j<array1.length; j++){
           if (array1[j]<min){
               min=array1[j];
           }
       }
       System.out.println("minimum is:" +min);
       
       
       array2[0]=randomGenerator.nextInt(101);
     for (int t=1; t<array2.length; t++){ //sets up loop to add one random integer to every index of the output array
          array2[t]=(randomGenerator.nextInt(101)+array2[t-1]); //generates random int
       }
       
        String print="{";
  	for(int k=0;k<array2.length;k++){
    	if(k>0){
      	print+=", ";
    	}
    	print+=array2[k];
  	}
  	print+="} ";
  	System.out.println(print);
  	
  	 int max=array2[0];
       for (int j=0;j<array2.length; j++){
           if (array2[j]>max){
               max=array2[j];
           }
       }
       System.out.println("maximum is:" +max);
       
     System.out.println("Please enter a positive integer");
     Scanner myScan=new Scanner(System.in);
       while(!myScan.hasNextInt()){
         System.out.print("please enter an integer!!!!!");
         myScan.next();
       }
       int num= myScan.nextInt();
        while (num<0){
            System.out.print("Please enter a POSITIVE integer: ");
            num=myScan.nextInt();
        }
        
    int high=49;
    int low=0;
    int position=(high+low)/2;
      while ((array2[position]!=num) && (low<=high)){
          System.out.println(array2[position]);
          if (array2[position]>num){
          high=high-1;
          }
          else{
             low=low+1; 
          }
          position=(high+low)/2;
           System.out.println(position);
      }
      if (low<=high){
           System.out.println("The number was found in array at index number:  " + position);
         
     }
      else{
          System.out.println("Sorry, the number is not in this array.");
         }
       
       
}
}