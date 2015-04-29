// D = {2.0, 1.2, 3.0, 3.2, 3.4, 7.3} 
import java.util.Random;
public class Practice{ 
    public static void main(String [] args){
  int G[]={1, 2, 5, 7, 10, 11, 14, 16, 19, 21, 22, 29, 47, 52};
  int A[]={234, 222, 123, 111, 90, 23, 11, 6, 2, 0};
  int length= A.length;
  int high=A.length-1;
  int target=123;
  int low=0;
  int position=((high+low)/2)+1;
  int counter=1;
    while (A[position]!=target && low<=high){
        if (A[position]>target){
            low=position+1;
            counter++;
            System.out.println(A[position]);
        }
        if (A[position]<target){
            
            high=position-1;
            counter++;
            System.out.println(A[position]);
        }
        position=((high+low)/2);
    }
    if (low<=high){
        System.out.println("The number was found after "+counter+" iterations");
        System.out.println("index: " +position);
    }
    else{
        System.out.println("The num was not in the array");
    }
    }
}
