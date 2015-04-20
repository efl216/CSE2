


import java.util.Random;
import java.util.Scanner;

public class RowColumn{
public static void main(String[] args){
    
    Random randomGenerat,m,or = new Random(); //declares, instance, and construct random generator
    Scanner myScan=new Scanner(System.in);
    
    
    
    
    
    
     System.out.println("Enter a matrix width");
     int width=myScan.nextInt();
     if (width<=0){
         System.out.println("The matrix is empty");
         width=myScan.nextInt();
     }
     System.out.println("enter a matrix height");
     int height=myScan.nextInt();
     if (height<=0){
         System.out.println("The matrix is empty");
         height=myScan.nextInt();
     }
     
      System.out.println("Enter another matrix width");
     int width2=myScan.nextInt();
     if (width2<=0){
         System.out.println("The matrix is empty");
         width2=myScan.nextInt();
     }
     System.out.println("enter another matrix height");
     int height2=myScan.nextInt();
     if (height2<=0){
         System.out.println("The matrix is empty");
         height2=myScan.nextInt();
     }
    
     System.out.println("Do you want the first matrix row-major or column-major? (0 or 1 respectively)");
     int major=myScan.nextInt();
     boolean format=false;
     if (major==0){
         format=true;
     }
     
     System.out.println("Do you want the second matrix row-major or column-major? (0 or 1 respectively)");
     int major2=myScan.nextInt();
     boolean format2=false;
     if (major2==0){
         format2=true;
     }
     
     System.out.println("Matrix 1 is:  ");
     int [][] Array1= increasingMatrix(width, height,format);
     printArray(Array1, format);
     System.out.println("Matrix 2 is:  ");
     int [][] Array2= increasingMatrix(width, height,format);
     printArray(Array2, format);
     System.out.println("Matrix 3 is:  ");
     int [][] Array3=increasingMatrix(width2, height2, format2);
     printArray(Array3, format2);
    //  int [][]Array3=increasingMatrix(width2, height2, format2);
    //  System.out.println("The transposed array is: ");
    //  Array3=translate(Array3);
    //  printArray(Array3, format);
     
     
    // int num=Array2.length;
    // int num2=Array2[0].length;
    // System.out.println(num);
    // System.out.println(num2);
    
    
    
    
    
    
    
    
    
    
    
     
     
     
     
}
     
     
     public static int[][] increasingMatrix(int width, int height, boolean format){
         
         int [][] myArray=new int [height][width];
         int k=1;
         if (format==true){
             for (int i=0; i<myArray.length; i++){
                 for (int j=0; j<myArray[i].length; j++){
                     
                     myArray[i][j]=k;
                     k++;
                    
                        }
                     
                    }
             }
            else{
                 myArray=new int [height][width];
              for (int j=0; j<myArray[1].length; j++){
               for (int i=0; i<myArray.length; i++){
                     myArray[i][j]=k;
                     k++;
                    
            } 
               }
            }
             
         //}
      return myArray;   
     }
    
    public static void printArray(int [][]array,boolean format){
        //int length= array.length;
        //int height= array[1].length;
         
  	     for(int k=0; k<array.length;k++){
  	         for (int l=0; l<array[k].length; l++){
                System.out.print(array[k][l]+" ");
  	         }
  	         //out+="}";
  	         System.out.println();
  	         }
    }
    
    public static int [][] translate(int [][]array){
        int j=1;       
        int width=array.length;
        int length=array[1].length;
        int [][] newArray=new int[length][width];
         for (int l=0; l<length; l++){
          for (int k=0; k<width; k++){
                newArray[l][k]=j;
                j++;
            }
        }
        return newArray;
    }
    
//   public static int[][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
      
    
    
    
    
    
    
    
    
}
     
     