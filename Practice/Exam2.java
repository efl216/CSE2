




public class Exam2 { //define a class
    public static void main(String [] args){
 int [] array= {0,1,2,3,4,5,6,7,8,9,10};
 int key=0;
 int high= array.length-1;
 int low=0;
 int position= (high+low)/2;
 int counter=0;
 while (array[position]!=key && high>=low){
     if (array[position]>key){
         high=position-1;
         position=(high+low)/2;
         
     }
     if (array[position]<key && high >=low){
         low=position+1;
         position=(high+low)/2;
         
     }
     counter++;
 }
  System.out.println("The number was found at index: " +position);
  System.out.println("There were " +counter+ " iterations");
    }
}

