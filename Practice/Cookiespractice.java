//Lab04
//Emily Levenson
// February 11
//This program uses the scanner class to obtain how many cookies
//the user wants, how many people theyre buying it for, how many
//cookies each person should get, and whether the cookies is evenly 
//divisble among the people and if there is enough for each person

//import the scanner class
import java.util.Scanner;

//add the Cookies class
public class Cookiespractice{
    //add the main method
    public static void main(String[] args){
        //declare an instance of Scanner object, and call Scanner contructor. 
        //tells Scanner that I am creating an instance that will take input from 
        //STDIN
        Scanner myScanner = new Scanner(System.in);
        
        //prompt the user to enter number of people
        System.out.print("Enter the number of People: ");
        //checks to make sure the number inputted is an integer
           
            if (myScanner.hasNextInt()) {
                int numPeople = myScanner.nextInt();
        
                   if (numPeople > 0 ) {
                     System.out.print("Enter the number of Cookies:  "); 
                       
                        if (myScanner.hasNextInt()) {
                           int numCookies = myScanner.nextInt();
                           System.out.print("How many cookies do you want each person to get?:  "); 
                            
                            if (myScanner.hasNextInt()) {
                                 int numPerPerson=myScanner.nextInt();
                                 int numNeeded= numPerPerson*numPeople;
                                 int numHave=numCookies-numNeeded; 
                                 int evenlyDiv=numCookies % numNeeded;
                                    
                                    if (evenlyDiv == 0) {
                                      System.out.println("You have enough cookies for each person and the amount will divide evenly");
                                       return;
                                    }
                                    else{
                                         
                                         if ((numHave>0) && (evenlyDiv != 0)) {
                                         System.out.println("You have enough cookies for each person but the amount will not divide evenly:  ");
                                         return;}
                                    
                                        else {
                                        System.out.println("You do not have enough cookies");
                                        return;
                                           }
                                       
                                    }
                            }
                                    
                            else{
                             System.out.println("You did not enter an int");
                             return;
                             }     
                            }
    
                        else{
                        System.out.println("You did not enter an int");
                        return;
                        }
                   }
              else{ 
                    System.out.println("You did not enter an integer greater than zero");
                    return;
                     }
            }
            
            else{
             System.out.println("You did not enter an int");
             return;
                      }
}
}
                      
//                         else{ 
//                      System.out.println("You did not enter an integer greater than zero");
//                        return;
//                            }
                      
                      
//                       }
                           
                           
                       
                       
            
                
//            else{
//                    System.out.println("You did not enter an int");
//                    return;
//                    //leaves the program 
                
    
               
                
                
//                 if (people > 0 ) {
                   
//                    System.out.print("Enter the number of Cookies:  "); 
//                    }
//                     else{ 
//                        System.out.println("You did not enter an integer greater than zero");
//                        return;
//                    }
//            
//                    
//                
//                    int numCookies=myScanner.nextInt();
//                        //int cookiesInt=myScanner.hasNextInt();
//                        
//                        if (myScanner.hasNextInt());{
//                            System.out.print("How many cookies do you want each person to get?:  "); 
//                            }
//                            
//                            
//                         else{
//                            System.out.println("You did not enter an int");
//                            return;
//                        }
//                        //leaves the program 
//                    
//                            
//                            
//                            int numPerPerson=myScanner.nextInt();
//                              // int numPerPersonInt=myScanner.hasNextInt();
//                               if (myScanner.hasNextInt()); {
//                                  int numNeeded= numPerPerson*people;
//                                  int numHave=numCookies-numNeeded; }
//                                  
//                              else{
//                                  System.out.println("You did not enter an int");
//                                   return;
//                                    }
//                                   //leaves the program 
//                  
//                              
//                                  
//                                      if (numCookies % numNeeded == 0); {
//                                       System.out.print("You have enough cookies for each person and the amount will divide evenly:  ");
//                                       return;
//                                      }
//                                      
//                                       else if
//                                           ((numHave>0) && (numCookies % numNeeded != 0)); {
//                                          System.out.print("You have enough cookies for each person but the amount will not divide evenly:  ");
//                                          return;
//                                           
//                                       }
//                                      
//                                      else  {
//                                          System.out.println("You do not have enough cookies");
//                                          return;
//                                            }
//                              
                 
