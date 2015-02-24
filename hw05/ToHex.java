//Emily Levenson
//February 18, 2015
//cse2 hw05
//This program asks user to input 3 decimal RGB values and convert them to hexadecimal values

import java.util.Scanner;

//define a class
public class ToHex{ 
    
    //add main method
    public static void main(String[] args){
        
        //declare an instance of Scanner object, and call Scanner contructor. 
        //tells Scanner that I am creating an instance that will take input from 
        //STDIN
        Scanner myScanner=new Scanner(System.in);
        //prompt user for 3 numbers
        System.out.print("Please enter three numbers representing RGB values from 0-225: ");
        
        //if the first number is an interger, then ask for second numnber
        if(myScanner.hasNextInt()){
            int red=myScanner.nextInt(); //call first number red
            if (myScanner.hasNextInt()){ //if the second number is an integer, ask for the third number
                int green=myScanner.nextInt(); //call second number green
                if(myScanner.hasNextInt()){ //if the third number is an integer
                     int blue=myScanner.nextInt(); //call third number blue
                
                     if(red<0 || red>255 || green<0 || green>255  || blue<0 || blue>255) { //checks to make sure all values are in the desired range
                        System.out.println("Please enter a valid numbers in the range of 0-255"); //if one of the numbers is not in the range, print error statement
                        return;
                        }
                     else{ //if numbers are in the right range
                        System.out.println("" +red+ "  " +green+"  " +blue+"  "); //print out the three numbers
                            //computes the hexadecimal value of red//
                            int hexRed3= (red/16); 
                            String hexRed=Integer.toString(hexRed3);
                            int hexRed4=(red%16);
                            String hexRed2=Integer.toString(hexRed4); //converts the number to a string
                            
                            //computes the hexadecimal value of green//
                            int hexGreen3=(green/16);
                            String hexGreen=Integer.toString(hexGreen3);
                            int hexGreen4=(green%16);
                            String hexGreen2=Integer.toString(hexGreen4);//converts number to a string
                            
                            //computes the hexadecimal value of blue//
                            int hexBlue3=(blue/16);
                            String hexBlue=Integer.toString(hexBlue3);
                            int hexBlue4=(blue%16);
                            String hexBlue2=Integer.toString(hexBlue4);// converts number to a string
                            
                            
                            
                            
                            //switch statement for first digit of red number in order to make it A-F representing 10-15 in the hexadecimal system
                            switch (hexRed) {
                            case "10":
                                 hexRed="A";
                                break;
                            case "11":
                                  hexRed="B";
                                 break;
                            case "12":
                                   hexRed="C";
                                break;
                            case "13":
                                  hexRed="D";
                                break;
                            case "14":
                                  hexRed="E";
                                break;
                            case "15":
                                  hexRed="F";
                                 break;
                             default:
                        
                                break;
                                }
        
 //switch statement for second digit of red number in order to make it A-F representing 10-15 in the hexadecimal system
  
                             switch (hexRed2) {
                            case "10":
                                hexRed2="A";
                                break;
                            case "11":
                                  hexRed2="B";
                                 break;
                            case "12":
                                   hexRed2="C";
                                break;
                            case "13":
                                  hexRed2="D";
                                break;
                            case "14":
                                  hexRed2="E";
                                break;
                            case "15":
                                  hexRed2="F";
                                 break;
                             default:
                                
                                break;
                                }    
                                
                               
                                
                            System.out.print(""+hexRed+""+hexRed2+"");
                        
   //switch statement for first digit of green number in order to make it A-F representing 10-15 in the hexadecimal system
                           
                           switch (hexGreen) {
                               
                            case "10":
                                 hexGreen="A";
                                break;
                            case "11":
                                  hexGreen="B";
                                 break;
                            case "12":
                                   hexGreen="C";
                                break;
                            case "13":
                                  hexGreen="D";
                                break;
                            case "14":
                                  hexGreen="E";
                                break;
                            case "15":
                                  hexGreen="F";
                                 break;
                             default:
                        
                                break;
                                }
                                
 //switch statement for second digit of green number in order to make it A-F representing 10-15 in the hexadecimal system
                             switch (hexGreen2) {
                            case "10":
                                hexGreen2="A";
                                break;
                            case "11":
                                  hexGreen2="B";
                                 break;
                            case "12":
                                   hexGreen2="C";
                                break;
                            case "13":
                                  hexGreen2="D";
                                break;
                            case "14":
                                  hexGreen2="E";
                                break;
                            case "15":
                                  hexGreen2="F";
                                 break;
                             default:
                                
                                break;
                                }    
                                
                            
                                
                            System.out.print(""+hexGreen+""+hexGreen2+"");
                        
 //switch statement for first digit of blue number in order to make it A-F representing 10-15 in the hexadecimal system
                        
                            switch (hexBlue) {
                               
                            case "10":
                                 hexBlue="A";
                                break;
                            case "11":
                                  hexBlue="B";
                                 break;
                            case "12":
                                   hexBlue="C";
                                break;
                            case "13":
                                  hexBlue="D";
                                break;
                            case "14":
                                  hexBlue="E";
                                break;
                            case "15":
                                  hexBlue="F";
                                 break;
                             default:
                        
                                break;
                                }
                               
  //switch statement for second digit of blue number in order to make it A-F representing 10-15 in the hexadecimal system
                               
                             switch (hexBlue2) {
                            case "10":
                                hexBlue2="A";
                                break;
                            case "11":
                                  hexBlue2="B";
                                 break;
                            case "12":
                                   hexBlue2="C";
                                break;
                            case "13":
                                  hexBlue2="D";
                                break;
                            case "14":
                                  hexBlue2="E";
                                break;
                            case "15":
                                  hexBlue2="F";
                                 break;
                             default:
                                
                                break;
                                }    
                            
                                
                            System.out.print(""+hexBlue+""+hexBlue2+"\n");
    //all the hexadecimal numbers should have printed on one line ///                    
                        
                }
            }
            //if the blue number is not an integer, print error message
            else {
                System.out.println("Please enter only integers");
                return;
            }
        }
        else {  //if the green number is not an integer, print error message
   
            System.out.println("Please enter only integers");
            return;
        }
        }
        else{ //if the red number is not an integer, print error message

         System.out.println("Please enter only integers");
            return;
        }
        

        
        
        
    }
}