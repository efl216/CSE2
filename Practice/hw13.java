//Emily Levenson
//cse002
//This program creates a 4D arrays, it sorts the 4D arrays based on length, sorts the 3D arrays in ascending order based on value, and then computes the average
//of all the elements in the array


import java.util.*;

public class hw13{ //define a class
    public static void main(String[] args){ //add main method
         Random rando= new Random();
         Scanner myScan=new Scanner(System.in);
         double [][][][] A=new double[3][][][]; //initialize 4D array
         
         
         ///The following code obtains VALID integers for X and Y
         System.out.println("Enter an integer X: ");
          while(!myScan.hasNextInt()){
                System.out.print("please enter an integer!!!!!");
                myScan.next();
            }
         int X= myScan.nextInt();
         while (X<0 ) {
                System.out.println("Please enter a number greater than zero");
                X=myScan.nextInt();
            }
         System.out.println("Enter an integer Y where Y > X: ");
         while(!myScan.hasNextInt()){
                System.out.print("please enter an integer!!!!!");
                myScan.next();
            }
         int Y= myScan.nextInt();
         while (Y<=X) {
                System.out.println("Please enter a number greater than X");
                Y=myScan.nextInt();
            }
/// The following portion of code allocates a random double to each member of the 4D array
        
         for (int i=0; i<3; i++){
             int randNum1= X+1+(int)(Math.random()*(Y-X));  //gets random number
             A[i]=new double[randNum1][][];  //random number is the length of the 3D arrays
             
             for (int j=0; j<A[i].length; j++){
                A[i][j]=new double[randNum1][];  //random number is also the length of the 2D arrays                        
             
                 for (int k=0; k<A[i][j].length; k++){
                     A[i][j][k]=new double[randNum1]; //and the random number is the length of the 1D arrays                           
                     for (int l=0; l<A[i][j][k].length; l++){          
                        double g=rando.nextDouble()*30.0;
                     int num= (int) (g*10);
                     double num2=(num/10.0); 
                     
                     
                     A[i][j][k][l]=num2;  //assigns a random double to every member of 4D array
                     }
                     
                 }
             }
         }
         System.out.println("The original array is" );
          printArray(A);
             
          System.out.println("The statistics of the array are: ");
              statArray(A); 
              System.out.println();
               

          sort3DArray(A);
           printArray(A);
          
          System.out.println("THE  SORTED ARRAY IS:   ");
                  sort4DArray(A);
                  printArray(A);
  
     
     
    }

        public static void printArray(double [][][][]A){ //this method prints the 4D array. It groups each 3D array together and puts lines in between each 3D array
          System.out.print("{");
          for (int i=0; i<3; i++){
              System.out.print("{");
             for (int j=0; j<A[i].length; j++){
                 System.out.print("{");
                 for (int k=0; k<A[i][j].length; k++){
                  System.out.print("{");
                     for (int l=0; l<A[i][j][k].length; l++){
                         if (l<(A[i][j][k].length-1)){
                         System.out.print(A[i][j][k][l]+", ");
                         }
                         else {
                         System.out.print(A[i][j][k][l]+" ");
                          }
                    }
                  System.out.print("}");
                // System.out.println();
                }
                
                System.out.println("}");
                
           // System.out.println();
            }
            System.out.print("}");
            System.out.println();
            System.out.println();
          }
          System.out.println("}");
          
    
        }
    
         
    public static void statArray(double [][][][]A){  //this method counts the number of members in the 4D array, computes their sum, and then finds the average
          double sum=0;  
          int numElements=0;;
          for (int i=0; i<3; i++){
             for (int j=0; j<A[i].length; j++){
                 for (int k=0; k<A[i][j].length; k++){
                     for (int l=0; l<A[i][j][k].length; l++){
                    sum+=A[i][j][k][l];
                    numElements++;
                    
                    }
                }
            }
          }            
              
        System.out.println("The sum= "+sum);
        System.out.println("There are "+numElements+ " number of elements");
       
        double average=sum/(double) numElements;
        System.out.println("The average= " +average);
                     
                     
                     
    }
    
   public static void sort4DArray(double [][][][] A){ //this method sorts the 4D arrays based on insertion sort
            double next [][][]=A[0]; //initialize 3D array
           for (int k=0; k<3; k++){ //counter for each 3D array
            int r=1;
            double [] lowest=smallest(A); //gets smallest value of each 3D array
             int ThreeDlength=A[k].length; 
             if(A[r].length==A[k].length && (r<3) && (k<3)){ //sorts based on the lowest values of each 3D sub array
              if (lowest[k]>lowest[r]){
               next=A[k];
               A[k]=A[r];
               A[r]=next;
              // r++;
              }
             next=A[0];
             }
              r++; 
           }
           
        for (int i=1; i<3; i++){
            int ThreeDlength=A[i].length; 
             next=A[i];
            // double key[][][]=A[i];
             int j=i;
             while ((j>0)&&(A[j-1].length>ThreeDlength)){ //this is the insertion sort method, it moves the smaller arrays (in length) to the smaller indexes of the 4D array
                 A[j]=A[j-1];
                 j--;
             }  A[j]=next;
        }
          
             
                 
             // }
           
   }
   //This method sorts the 3D arrays in ascending order
   public static double [][][][] sort3DArray(double [][][][] A){
       for (int i=0; i<3; i++){ //loops through 4D
           for (int j=0; j<A[i].length; j++){ //loops 3D
               for (int k=0; k<A[i][j].length; k++){ //loops each 2D array
                    for (int l=0; l<A[i][j][k].length-1; l++){ //begins selection sort
                   int index=l; //stores the counter
                   for (int m=l+1; m<A[i][j][k].length; m++){ 
                       if(A[i][j][k][m]<A[i][j][k][index]){ //if the current member is less than the index member, 
                           index=m; //then the index is now the current member. 
                       }
                   }
                       
                     if (index!=l){ // swaps one member for another based on their values
                      double smallNum=A[i][j][k][l];
                       A[i][j][k][l]=A[i][j][k][index];
                       A[i][j][k][index]=smallNum;
                   }
                  index=1;
                    }
           
                }
                
            }
       }
   
    return A;
   }
   
   //This method finds the smallest value in each of the 3D arrays             
   public static double [] smallest(double [][][][] A){
       double small []=new double[3];
       double tiny=999.9;
       for (int i=0; i<3; i++){
           for (int j=0; j<A[i].length; j++){
               for (int k=0; k<A[i][j].length; k++){
                    for (int l=0; l<A[i][j][k].length; l++){
                   //int index=l;
                   //for (int m=l+1; m<A[i][j][k].length; m++){
                       if(A[i][j][k][l]<tiny){
                           
                           small[i]=A[i][j][k][l];
                           tiny=A[i][j][k][l];
                          // System.out.println(small[i]);
                       }

                    }
           
                }tiny=999.9;
               
                
            } tiny=999.9;
       }
   
    return small;
   }
     
   public static double [][][][] furtherSort(double [][][][] A){ //this method sorts the 4D arrays if they are the same size, and need to be sorted based on their lowest values.
       double small []=new double[3];
       double tiny=999.9;
       int index;
       for (int i=0; i<3; i++){
           for (int j=0; j<A[i].length; j++){
               for (int k=0; k<A[i][j].length; k++){
                    for (int l=0; l<A[i][j][k].length; l++){
                   //int index=l;
                   //for (int m=l+1; m<A[i][j][k].length; m++){
                       if(A[i][j][k][l]<tiny){
                           index=k;
                           small[i]=A[i][j][k][l];
                           tiny=A[i][j][k][l];
                        }
                    }
               }
            } 
            tiny=999.9;
       }
       for (int i=1; i<3; i++){
            //int ThreeDlength=A[i].length;
            double [][][] next=A[i];
            // double key[][][]=A[i];
             int j=i;
             while ((j>0)&&(small[j-1]>small[j])){
                                                 //    System.out.println("The length is========= "+ A[j].length);
                 A[j]=A[j-1];
                 j--;
             }
             A[j]=next;
                 
             }
             return A;
   }           
                                   
                     
                     
                     
                     
         
    
}