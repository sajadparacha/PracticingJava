package profitcalculation;

public class CalculateCompoundingProfit {

    public static void main (String args[]){

        // Parameters
        int noOfMonths=48;
        double profitPercentage=2;
        double charityPercentage=15;
        double amountInvested=3800000;
        //double amountInvested=6900000;


        double profit=0;
        double charity=0;
        //Totals
        double totalCharity=0;
        double totalProfit=0;
        double investmentPlusProfit=0;

        System.out.println("Orignal Amount Invested ===============>  "+amountInvested);

        for(int i=1;i<=noOfMonths;i++){

            profit=(amountInvested*profitPercentage/100);
            charity=profit*charityPercentage/100;
            totalCharity+=charity;
            totalProfit+= (profit-charity);
            investmentPlusProfit = profit-charity+amountInvested;
            amountInvested=investmentPlusProfit;
        }


        System.out.println("Total Charity after "+noOfMonths+" months =  "+totalCharity);
        System.out.println("Total profit after "+noOfMonths+" months =  "+totalProfit);
        System.out.println("Compounded amount after "+noOfMonths+" months =  "+investmentPlusProfit);




    }
}
