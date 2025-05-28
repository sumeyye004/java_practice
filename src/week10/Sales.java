package week10;

/*
calculateSales(300000, 200000, 250000, 1000000, 1500000) -> true
calculateSales(3000000, 5000, 250000, 1000000, 3500000) -> false

The company had a goal to earn a total of 5,000,000 in sales this year.
    Return true if the company reached their goal and false if they did not.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Sales {

    public static void main(String[] args) {

    ArrayList<Double> sales = new ArrayList<>(Arrays.asList(3000000.0, 50000.0, 250000.0, 1000000.0, 3500000.0));
        System.out.println(calculateSales(sales));
    }

    public static boolean calculateSales(ArrayList<Double> sales){

        double total = 0;
        for( double eachSales : sales){
            total += eachSales;
        }
        return total >= 5_000_000;
    }
}
