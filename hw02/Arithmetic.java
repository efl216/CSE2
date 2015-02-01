//Emily Levenson
//January 30, 2015
//cse002, hw2
//calculates cost of each item, sales tax, total cost before and after tax

//define a class
public class Arithmetic{
    
//add main method
    public static void main(String[] args) {
        
        //input variables
        int nSocks=3; //number of pairs of socks
        double sockCost$=2.58; //cost per pair of socks, '$' is part of variable name
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per glass
        int nEnvelopes=1; //number of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        double taxPercent=0.06; //amount of sales tax in PA

        
        //print all input data
         System.out.println("Item 1 is Socks");
         System.out.println("The number of Socks purchased is "+nSocks);
         System.out.println("The cost per sock is $"+sockCost$);
         System.out.println("                                ");
         System.out.println("Item 2 is Glasses");
         System.out.println("The number of Glasses purchased is "+nGlasses);
         System.out.println("The cost per Glass is $"+glassCost$);
         System.out.println("                                ");
         System.out.println("Item 3 is Envelopes");
         System.out.println("The number of Envelopes purchased is "+nEnvelopes);
         System.out.println("The cost per Envelope box is $" +envelopeCost$);
         System.out.println("                                ");
        
        //calculations
        double totalSocksCost$, totalSocksTax$, totalGlassCost$, totalGlassTax$, totalEnvelopeCost$, totalEnvelopeTax$, socksTax$, glassTax$, envelopeTax$; //declares all the variables that will be calculated
            totalSocksCost$=nSocks*sockCost$; //calculates total cost of socks purchased
            totalSocksTax$=totalSocksCost$*taxPercent; //total tax on socks
            totalGlassCost$=nGlasses*glassCost$; //calculates total cost of glasses purchased
            totalGlassTax$=totalGlassCost$*taxPercent; //total tax on glasses
            totalEnvelopeCost$=nEnvelopes*envelopeCost$; //total cost of envelopes
            totalEnvelopeTax$=totalEnvelopeCost$*taxPercent; //total tax on envelopes
            
            
            //convert values to integers so the prices have two values after the decimal
            socksTax$=totalSocksTax$*100;
            int socksTaxInt$=(int) socksTax$;
            double socksTaxInt1$= (double) socksTaxInt$/100;
            
            glassTax$=totalGlassTax$*100;
            int glassTaxInt$=(int) glassTax$;
            double glassTaxInt1$= (double) glassTaxInt$/100;
            
            envelopeTax$=totalEnvelopeTax$*100;
            int envelopeTaxInt$=(int) envelopeTax$;
            double envelopeTaxInt1$= (double) envelopeTaxInt$/100;
            
        
            
                
        double totalCostPreTax$, totalCostPostTax$, totalTax$,salesTax$, totalCost$; //declares the variables that will calculated regarding total costs
            totalCostPreTax$=totalSocksCost$+totalEnvelopeCost$+totalGlassCost$; //total cost of all items before tax
            totalCostPostTax$=totalCostPreTax$*taxPercent+totalCostPreTax$; //total cost after tax
            totalTax$=totalCostPreTax$*taxPercent; //amount of tax on total purchases
            
            //calculates the value of total tax and total cost post tax with two decimal places 
            
            salesTax$=totalTax$*100;
            int salesTaxInt$=(int) salesTax$;
            double salesTaxInt1$= (double) salesTaxInt$/100;
            
            totalCost$=totalCostPostTax$*100;
            int totalCostInt$=(int) totalCost$;
            double totalCostInt1$=(double) totalCostInt$/100;
            
            //print out all calculations
            System.out.println("The total cost of socks is $"+totalSocksCost$);
            System.out.println("The sales tax for socks purchased is $"+socksTaxInt1$);
            System.out.println("                                ");
            System.out.println("The total cost of glasses is $"+totalGlassCost$);
            System.out.println("The sales tax for glasses purchased is $"+glassTaxInt1$);
            System.out.println("                                ");
            System.out.println("The total cost of envelopes is $"+envelopeCost$);
            System.out.println("The sales tax for boxes of envelopes purchased is $" +envelopeTaxInt1$);
            System.out.println("                                ");
            System.out.println("The total cost of purchases before tax is $"+totalCostPreTax$);
            System.out.println("The total sales tax is $"+salesTaxInt1$);
            System.out.println("The total cost of purchases after tax is $"+totalCostInt1$);
        
    }
    
}