//Emily Levenson
//cse02 hw 07
//waves.java --> program to print out the integers in wave form. Program utilizes for loops, do while loops, and while loops.
//March 6, 2015

import java.util.Scanner;

public class wavespractice{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //scanner accepts input
        System.out.println("Enter a number between 1 and 30, inclusive");
        while (!myScanner.hasNextInt()){
            System.out.println("Enter an integer please");
            myScanner.next();
        }
        
        int num=myScanner.nextInt();
        while (num<1 || num>30){
            System.out.println("Please enter a number in the proper range [0,30]");
            num=myScanner.nextInt();
        }
        System.out.println("A proper number was entered");
        
        for (int i=1; i<=5; i++){
            for (int j=4; j>i-1; j--){
                System.out.print(".");
            }
            System.out.println(i);
        }
        
       
       
    //     for(int i=1; i<=num; i=i+1){
    //         if(i%2==0){
    //         for(int counter=0; counter<i; counter=counter+1){
    //             for(int counter2=0; counter2<counter; counter2=counter2+1){
    //               System.out.print(i); 
    //             }
    //             System.out.println(i);
    //         }
    //         System.out.print("");
            
    //     }
    //     else{
        
    //         for(int counter=i; counter>=1; counter=counter-1){
    //             for(int counter2=counter; counter2>1; counter2=counter2-1){
    //               System.out.print(i); 
    //             }
    //             System.out.println(i);
    //         }
    //         System.out.print("");
        
    //     }
    //     }
  
    //     System.out.println("----------USING WHILE LOOPS----------------");  
        
    //     System.out.println("Enter a number between 1 and 30, inclusive, to use in the while loop");
    //     while (!myScanner.hasNextInt()){
    //         System.out.println("Enter an integer please");
    //         myScanner.next();
    //     }
        
    //     int num2=myScanner.nextInt();
    //     while (num2<1 || num2>30){
    //         System.out.println("Please enter a number in the proper range [0,30]");
    //         num=myScanner.nextInt();
    //     }
    //     System.out.println("A proper number was entered");
        
     
    //   //  num2=myScanner.nextInt();
    //     int k=1;
    //     while(k<=num2){
    //   // System.out.println("k equals: "+k);    
    //         if(k%2==0){
    //             int counter4=0;
    //             while(counter4<k){
    //             int counter5=0;
    //                 while(counter5<counter4){
    //               System.out.print(k); 
    //               counter5++;
    //             }
    //             System.out.println(k);
    //             counter4++;
    //         }
    //         System.out.print("");
    //         //k++;
            
    //     }
    //         else{
    //         //  System.out.println("else k equals: "+k);   
    //         int counter=k;
    //         while(counter>=1){
    //           int counter2=counter;
    //           counter=counter-1;
    //             while(counter2>1){
    //               System.out.print(k); 
    //                 counter2=counter2-1;
    //             }
    //             System.out.println(k);
               
    //         }
    //         System.out.print("");
        
    //     }
    //     k=k+1;    
    //     }
        
      
      
      
    // System.out.println("----------DO-WHILE LOOP---------------------");
    // System.out.println("Enter a number between 1 and 30, inclusive, to use in the do-while loop");
    //  while (!myScanner.hasNextInt()){
    //   System.out.println("Enter an integer please");
    //   myScanner.next();
    //   }
        
    //     num2=myScanner.nextInt();
    //   while (num2<1 || num2>30){
    //       System.out.println("Please enter a number in the proper range [0,30]");
    //       num=myScanner.nextInt();
    //     }
    //     System.out.println("A proper number was entered");
        
     
    //   //  num2=myScanner.nextInt();
    //      k=1;
    //     do {
    //   // System.out.println("k equals: "+k);    
    //         if(k%2==0){
    //             int counter4=0;
    //             do{
    //                 int counter5=0;
    //                  do{
    //                   System.out.print(k); 
    //                   counter5++;
                    
    //                  }
    //                  while(counter5<=counter4);
                     
    //                 System.out.println("");
    //                 counter4++;
    //             }
    //              while(counter4<k);
                
    //         System.out.print("");
    //         //k++;
            
    //     }
    //         else{
    //         //  System.out.println("else k equals: "+k);   
    //         int counter=k;
    //         do{
    //           int counter2=counter;
    //           counter=counter-1;
    //             do{
    //               System.out.print(k); 
    //                 counter2=counter2-1;
    //             }
    //             while(counter2>=1);    
                
    //             System.out.println("");
    //         } 
    //         while(counter>=1);   
            
    //         System.out.print("");
        
    //     }
    //     k=k+1; 
    //     }
    //      while(k<=num2);
        
        
        
    }
}

