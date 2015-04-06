//Emily Levenson
//cse02 lab10

import java.util.Scanner;

public class ArrayInputs{
    public static void main(String[] args){
        System.out.println("Please enter an integer for the size of an array: ");
        Scanner myScan= new Scanner(System.in);
        int arraySize=myScan.nextInt();
        int [] arrayNums=new int[arraySize];
       
        
        for (int i=0; i<arraySize; i++){
            
             arrayNums[i]=checkValue();
             System.out.println("i= "+i);
          
        }
        for (int j=0;j<arraySize; j++){
          System.out.println(arrayNums[j]);   
        }

        // for (int j=1; j<=arraySize; j++){
        //     System.out.println(arrayNums[j]);
        //  }
    }
       
       public static int checkValue(){
           Scanner myScan=new Scanner(System.in);
            System.out.println("Please enter a positive integer");
            while(!myScan.hasNextInt()){
                System.out.print("please enter an integer!!!!!");
                myScan.next();
                
            }
            
            int num= myScan.nextInt();
            while (num<0 ) {
                System.out.println("Please enter a number greater than zero");
                num=myScan.nextInt();
            }
      
       return num;
       }
}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
          // Scanner myScan= new Scanner(System.in);
          
    //       int k=1;
    //       while (myScan.nextInt()<0){
    //           if (k>size){
    //               break;
    //           }
    //           System.out.println("Please enter a positive integer");
    //             int num=myScan.nextInt();
    //             k++;
    
    //       }
    //         while(!myScan.hasNextInt()){
    //             System.out.println("Please enter a positive integer");
    //              int num=myScan.nextInt();
    //         }
    //         // while(myScan.nextInt()>=0){
    //         //     if (k>size){
    //         //         break;
    //         //     }
    //         //     int num=myScan.nextInt();
    //         // }
    //     // int num=myScan.nextInt();
    //      return num;
    //   }
       
       
        
    
