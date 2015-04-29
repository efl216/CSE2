// (b)  Write code to combine two one dimensional arrays A={2.0, 3.0, 3.4} and
//       B={ 1.2, 3.2, 7.3} into a resulting one dimensional array D. The resulting
//       array should look like

// D = {2.0, 1.2, 3.0, 3.2, 3.4, 7.3} 
import java.util.*;
public class Exam3{ //define a class
    public static void main(String [] args){
// Read 10 ints from the keyboard, and store them in an array. Display "true" on the screen
// if there is an even number of even numbers among these 10. Otherwise, display "false".


Scanner myScan =new Scanner(System.in);
System.out.println("Please enter 10 integers: ");
int [] A=new int[10];
for (int i=0; i<A.length; i++ ){
    while (!myScan.hasNextInt()){
        System.out.println("please enter a proper integer");
        myScan.next();
    }
    A[i]=myScan.nextInt();
    
}
boolean numEven=false;
int even=0;
for (int j=0; j<A.length; j++){
    if (A[j]%2==0){
        even++;
    }
}

if (even%2==0){
    numEven=true;
}
System.out.println(numEven);
}

}