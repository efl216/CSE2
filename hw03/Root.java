
//Emily Levenson
//February 5, 2015
//cse2 hw03
//This program prompts the user to enter a double and prints out an estimate of the crude root of the number and the value of the guess when cubed.

import java.util.Scanner; //import the scanner class

//define a class
public class Root {
    //add a main method
    public static void main(String[] args) {
        Scanner myScanner; //declare and instance of the scanner object
        
         myScanner=new Scanner (System.in); //construct the scanner object
    
        System.out.print("Enter a double: "); //prompts the user
        double number = myScanner.nextDouble(); //accepts the user input 
        
        double guess= number/3; //first guess
        double root1=(2*guess*guess*guess+number)/(3*guess*guess); //second guess
        double root2=(2*root1*root1*root1+number)/(3*root1*root1); //third guess
        double root3=(2*root2*root2*root2+number)/(3*root2*root2); //fourth guess
        double root4=(2*root3*root3*root3+number)/(3*root3*root3); //fifth guess
        double cube=root4*root4*root4; //cube the last guess
        
        
        //print out the cube root of the input number (the last guess) and the cubed value of the last guess
        System.out.println("The cube root of "+number+" is "+root4+" ");
        System.out.println(" "  +root4+ " * " +root4+ " * " +root4+ " = " +cube+"");
    }
}
