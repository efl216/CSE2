
import java.util.Random;
import java.util.Scanner;

public class Multiply{ //define a class
public static void main(String[] args){ //define main method

Scanner myScan=new Scanner(System.in); //construct the scanner object

////the following code accepts input for the widths and heights of two matrices\\\\\\\\\\\\\
////the code checks to makes sure all inputs are integers and greater than zero\\\\\\\\\\

System.out.println("Please enter the width and height of two matrices: "); //prompt user
System.out.println("Width 1: "); //prompt user
while (!myScan.hasNextInt()){ //makes sure input is an integer
    System.out.println("please enter integers ONLY");
    System.out.println("Width 1: ");
    myScan.next();
}
int w1=myScan.nextInt(); //assigns user input to a variable
while (w1<=0){ //checks to see if integer is greater than zero
    System.out.println("please enter only integers greater than zero");
    System.out.println("Width 1: ");
    w1=myScan.nextInt();
}

System.out.println("Height 1: ");
while (!myScan.hasNextInt()){
    System.out.println("please enter integers ONLY");
    System.out.println("Height 1: ");
    myScan.next();
}
int h1=myScan.nextInt();
while (h1<=0){
    System.out.println("please enter only integers greater than zero");
    System.out.println("Height 1: ");
    h1=myScan.nextInt();
}


System.out.println("Width 2: ");
while (!myScan.hasNextInt()){
    System.out.println("please enter integers ONLY");
    System.out.println("Width 2: ");
    myScan.next();
}
int w2=myScan.nextInt();
while (w2<=0){
    System.out.println("please enter only integers greater than zero");
    System.out.println("Width 2: ");
    w2=myScan.nextInt();
}

System.out.println("Height 2: ");
while (!myScan.hasNextInt()){
    System.out.println("please enter integers ONLY");
    System.out.println("Height 2: ");
    myScan.next();
}
int h2=myScan.nextInt();
while (h2<=0){
    System.out.println("please enter only integers greater than zero");
    System.out.println("Height 2: ");
    h2=myScan.nextInt();
}
while (w1!=h2){
    System.out.println("The two matrices are not compatible in dimensions");
    System.out.println("Enter a new Width and height for Matrix 2: ");
    w2=myScan.nextInt();
    h2=myScan.nextInt();
}

///////////////////the following code operates on the matrices \\\\\
int [][] Array1=randomMatrix(w1,h1); //initializes the first array with dimensions from user and assigns random values to it
System.out.println("Matrix 1: "); 
printArray(Array1); //calls on method to print the array 1
System.out.println("=======================================");
System.out.println("Matrix 2: ");
int [][] Array2=randomMatrix(w2,h2); //initializes the second array with dimensions from user and assigns random values to it
printArray(Array2); //calls on method to print array 2
System.out.println("=======================================");
System.out.println("Matrix 1 * Matrix 2: "); 
int [][] Array3=matrixMultiply(Array1, Array2); //calls on method that multiplies arrays 1 and 2 together and assigns the new array to a variable
printArray(Array3); //calls on method to print array 3


}



public static int[][] randomMatrix(int row, int column){ //this method creates arrays of given dimensions filled with random numbers from -10 to 10
       
         int [][] myArray=new int [column][row]; //initialize array 
         
         for (int i=0; i<myArray.length; i++){ //fill each member of two dimensional array
            for (int j=0; j<myArray[i].length; j++){
               myArray[i][j]=(int)(Math.random()*20)-10; //fills array with random numbers
            }
                     
        }
        return myArray; //returns the filled array 
}


 public static void printArray(int [][]array){ 
    for(int k=0; k<array.length;k++){ //iterates each row in the array
        for (int l=0; l<array[k].length; l++){ //iterates each element in each row
           System.out.print(array[k][l]+" "); //prints the value each index in array
           }
        System.out.println(); 
        }
 }
 
 
 public static int[][] matrixMultiply(int a[][], int b[][]){ //multiplies two matrices together
      
        //makes sure the two matrices are compatable in dimension
        if (a[1].length!=b.length){ //if the width of matrix a is not equal to the length of matrix b:
            System.out.println("Your matrices are not correct dimensions"); //print error statement
            return null; //return nothing
        }
        int [][] array=new int[a.length][b[1].length]; //intialize new array based on dimensions of output array (should have length of the num of rows of matrix a and width of the num of column in matrix b)
        for (int i=0; i<a.length; i++){ //iterates each row of array a
            for (int j=0; j<b[1].length; j++){ //iterates each column of array b
                for(int k=0; k<a[1].length; k++){ //iterates each column of array a
               array[i][j]+=a[i][k]*b[k][j]; //multiplies the two arrays together
            }         
        }
        } 
    return array;
 
}
}