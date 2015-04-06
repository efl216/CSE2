
import java.util.Random;
import java.util.Scanner;


public class words{
public static void main(String[] args){
    System.out.println("The "+adjective()+" "+adjective()+" "+subject()+" "+verb()+" the "+object());
    System.out.println("Do you want to generate another sentence? enter y or n"); 
        Scanner myScan= new Scanner(System.in);
        String rerun=myScan.next();
        while(rerun.equals("y")){
            System.out.println("The "+adjective()+" "+adjective()+" "+subject()+" "+verb()+" the "+object());
            System.out.println("Do you want to generate another sentence? enter y or n"); 
            rerun=myScan.next();
        }
    
}




public static String adjective(){
Random randomGenerator = new Random();
int randomInt = randomGenerator.nextInt(10);
String adj="";
switch (randomInt){
    case 1:
        adj="pretty";
        return adj;
    case 2:
        adj="enormous";
        return adj;
   case 3:
        adj="purple";
        return adj;        
   case 4:
        adj="skinny";
        return adj;        
   case 5:
        adj="ancient";
        return adj;
   case 6:
        adj="complicated";
        return adj;
   case 7:
        adj="disgusting";
        return adj;
   case 8:
        adj="flawless";
        return adj;     
   case 9:
        adj="luxorious";
        return adj;   
    default:
        adj="beautiful";
        return adj;
}
   
}

public static String subject(){
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(10);
    String noun="";
    switch (randomInt){
        case 1:
            noun="dog";
            return noun;
        case 2:
            noun="train";
            return noun;
        case 3:
            noun="shoes";
            return noun;
        case 4:
            noun="mother";
            return noun;    
        case 5:
            noun="baby";
            return noun;
        case 6:
            noun="dress";
            return noun;    
        case 7:
            noun="backpack";
            return noun;
        case 8:
            noun="giraffe";
            return noun;
        case 9:
            noun="salmon";
            return noun;
        default:
            noun="MONSTER";
            return noun;
    }
   
}



public static String verb(){
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(10);
    String verb="";
    switch (randomInt){
        case 1:
            verb="ran";
            return verb;
         case 2:
            verb="watched";
            return verb;
         case 3:
            verb="cleaned";
            return verb;
         case 4:
            verb="escabed";
            return verb;
         case 5:
            verb="itched";
            return verb;
         case 6:
            verb="ate";
            return verb;
         case 7:
            verb="frowned";
            return verb;
         case 8:
            verb="walked";
            return verb;
         case 9:
            verb="drove";
            return verb;
        default:
            verb="flew";
            return verb;
           
    }

}

public static String object(){
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(10);
    String object="";
    switch (randomInt){
        case 1:
            object="rainbow";
            break;
        case 2:
            object="dragon";
            break;
        case 3:
            object="computer";
            break;
        case 4:
            object="bathroom";
            break;
        case 5:
            object="cake";
            break;
        case 6:
            object="glasses";
            break;
        case 7:
            object="keyboard";
            break;
        case 8:
            object="iphone";
            break;
        case 9:
            object="sweatshirt";
            break;
        default:
            object="pen";
            break;
    }
    return object;
}
}