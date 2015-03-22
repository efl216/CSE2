//Emily Levenson
//cse2 lab08
//this program utilizes methods in order to produce the superfactorial of a number inputed by the user
//the first method is the main method, the additional two methods calculate the superfactorial and print the factorial 




import java.util.Scanner; //import the scanner

public class Factorial { //define a class
    
    public static void main(String[] args) { //add main method
        System.out.println("Please enter a positive number");
        Scanner scan = new Scanner(System.in); // //declare instance and construct scanner object
        int num = scan.nextInt(); //stores user input to a variable
        int sum = 0; //initializes the sum
        for(int i = 1; i <= num; i++){ //for loop to execute the factorial on each digit up to the final digit
            sum += factorial(i); //calls on the factorial method to obtain the factorial for integer from 1 to the value of the inputed value and adds the factorials together 
        }
        print(sum); //calls on the print method to print the final superfactorial sum
  }
    public static int factorial(int key){ //declare a method called factorial. output is an int, input is an int
        int mul = 1; //initialize the "mul" for the for loop
        for (int i = 1; i <= key; i++){ //for loop to execute the factorial for each integer from 1 to the value of the input
            mul *= i; //computes factorial
        }
        System.out.println(mul); //prints the factorial for each integer (1,sup)
        return mul; //output of the method
    }
    public static void print(int num){ //declare a method called print. input is an int, output has no type. 
        System.out.println("The super factorial is equal to " + num); //print statement for the superfactorial
    }
}