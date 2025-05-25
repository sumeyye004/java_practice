package week09;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ExpensesArray {

    public static void main(String[] args) {

        double accountBalance = 535.90;

        double[] expenses = {4.0, 3, 24.40, 59.10, 22.55, 31.50};

        //Print all values with Arrays.toString
        System.out.println(Arrays.toString(expenses));

        //Transaction History
        // transaction $5.0 - 250.56
        // Remaining balance: $ 55.40

        for(double eachExpense : expenses){
            accountBalance -= eachExpense;
            System.out.println("transaction $" + eachExpense + " - $" + accountBalance);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Remaining balance: $" + decimalFormat.format(accountBalance));

        System.out.println((float)accountBalance); // sometimes it helps

        //max and min transaction
        //sort, then read first and last indexes
        Arrays.sort(expenses);
        System.out.println(Arrays.toString(expenses));

        double min = expenses[0];
        double max = expenses[expenses.length-1];
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
