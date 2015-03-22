


import java.util.Scanner; //import the scanner

public class Exam2 { //define a class
    public static void main(String [] args){
// // for (int i=0; i<=4; i++){
// //     for (int j=1;j<=i+1; j++){
// //         System.out.print(i);
// //     }
// // System.out.println("");
// // }

// // // for (int i=5;i<=9;i++){
// // //     for (int j=i;j<=9;j++){
// // //         System.out.print(i);
        
// // //     }
// // //     System.out.println("");
// // // }
// // // }
// // // }

// // Scanner myScan=new Scanner(System.in);
// // int n=myScan.nextInt();
// // if (n>0){
// //     do {
// //         sumsq(n);
// //         System.out.println("Enter a number");
// //         n=myScan.nextInt();
// //     }
// //     while(n>0);
// // }
// // else {
// //     System.exit(0);
// // }
// // }

// // public static int sumsq(int n){
// //     int square=0;
// //     for (int i=1; i<=n;i++){
// //         square=square+(i*i);
        
// //     }
// //   // return square;
// //     System.out.println("1+2*2+3*3+...n*n for n= "+n+ "is "+square);
// //     return square;
// // }
// // }

// int i = 0;
// int j = 1;
// for(i = 1; i<4; i++){
// for(j = 1; j<3; j++){
// 	for (int k = 0; k<j; k++) {
// 		System.out.println( (int)(k + j) );
// 	}
// }
// i++;
// 	System.out.println( "test" );
// 	System.out.println("i is "+i);
// }
// }
// }

//for (int x=6;x>=1;x--){
    for (int i=4; i>=1; i--){
        for (int k=1; k<=i-1; k++){
            System.out.print(k);
        }
        System.out.println(i);
    }
}
}
