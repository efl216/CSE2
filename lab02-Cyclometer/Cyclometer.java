//Emily Levenson
//January 30, 2015
//cse2 lab 02
//This program is a bicycle cylometer that records the number of minutes, counts, miles, and distance of all bicycle trips


//define a class
public class Cyclometer{
    
//add main method
    public static void main(String[] args) {
        
        //input data
        int secsTrip1=480; //this stores the time in seconds of trip 1
        int secsTrip2=3220; //this stores the time in seconds of trip 2
        int countsTrip1=1561; //this stores the number of rotations of the front wheel during the time for trip 1
        int countsTrip2=9037; //this stores the number of rotations of the front wheel during trip 2
    
        //intermediate variables and output data
        double wheelDiameter=27.0, //this stores the diameter of the wheels
        PI=3.14159, //this stores pi, which is used to determine distance traveled
            feetPerMile=5280, //this stores the number of feet for mile
            inchesPerFoot=12, //this stores the number of inches per foot
            secondsPerMinute=60; //this stores the number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance;
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        //compute distance values
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print out the calculations
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+ totalDistance+" miles");
        
        
    }
}