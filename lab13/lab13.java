import java.util.*;


public class Exam2{
    public static void main(String[] args){
   int [][] Input=new int [5][];

        Random rando= new Random();
        for (int i=0; i<5; i++){
         Input[i]=new int[i*3+5];
         for (int j=0; j<Input[i].length; j++){
          Input[i][j]=rando.nextInt(40);
        }
        }
      for (int i=0; i<5; i++){
        for (int j=0; j<Input[i].length; j++){
          System.out.print(Input[i][j]+" ");
          
  
    }
    System.out.println();
}



    System.out.println("Sorted=======================");
    for (int k=0; k<Input.length; k++){
     Arrays.sort(Input[k]);
    }
for (int i=0; i<5; i++){
        for (int j=0; j<Input[i].length; j++){
          System.out.print(Input[i][j]+" ");
          
  
    }
    System.out.println();
}
int max=0;
for (int k=0; k<Input.length; k++){
 if (Input[k].length>max){
  max=Input[k].length;
 }

 }
 
 int [][]newArray=new int[5][max];
 
 System.out.println(newArray[0].length);
 for (int i=0; i<5; i++){
  for (int j=0; j<17; j++){
   newArray[i][j]=0;
  }
 }
 

 
 
 
 
 
 
 System.out.println("THE NEW ARRAY IS: ");
 
 for (int i=0; i<5; i++){
  for (int j=0; j<Input[i].length; j++){
   newArray[i][j]=Input[i][j];
  }
 }
   for (int i=0; i<5; i++){
        for (int j=0; j<newArray[i].length; j++){
          System.out.print(newArray[i][j]+" ");
          
  
    }
    System.out.println();
}
 

}
}
   
   
   
  


  