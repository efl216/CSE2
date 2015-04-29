

public class Exam2{
    public static void main(String [] args){
   
    double [][][][] A={{{{3.1, 28.3}}, {{24.7, 14.3}}}, {{{26.5, 9.8}}, {{14.3, 16.5}}}, {{{21.8, 26.2}}, {{12.0, 24.9}}}};


     
     System.out.println(A.length);
     System.out.println(A[0].length);
          System.out.println(A[1].length);
            System.out.println(A[2].length);

     System.out.println(A[0][1].length);
    //  System.out.println(A[0][2].length);
      // System.out.println(A[0][3].length);
        System.out.println(A[0][0].length);
    System.out.println(A[1][0].length);
    System.out.println(A[1][1].length);
     System.out.println(A[0][1][0][0]);
     System.out.println(A[1][1][0][1]);
    
      int four[][][][] = new int[2][2][2][2];
int i,j,k,l;
for (i=0; i<2; i++){
  for (j=0; j<2; j++){
    for (k=0; k<2; k++){
      for (l=0; l<2; l++)
      {
        four[i][j][k][l]= (i+1)*(j+1)*(k+1)*(l+1);
        System.out.print(four[i][j][k][l]+" ");
      }
  System.out.println(""); 
    }
   // System.out.println();
  }
     System.out.println();
}
        
        
        
        
        
        
        
        
    }
}





//     }
  
  
//   public static int [] noReps(int [] myArray){
//       int [] newArray=new int[myArray.length];
//       int counter=0;
//       for (int i=0; i<myArray.length; i++){
//           if (!search(myArray, myArray[i],i+1, myArray.length)){
//           newArray[i]=myArray[i];
//           counter++;
//       }
//       System.out.println(newArray[i]+" ");
//       }
//       System.out.println();
//       int y[]=resize(myArray, counter);
//       return y;
      
//   }
  
  
  
    


  