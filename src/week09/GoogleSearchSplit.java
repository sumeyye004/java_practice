package week09;

import java.util.Arrays;

public class GoogleSearchSplit {

    public static void main(String[] args) {

        String searchResults = "About 3,940,000,000 results (0.39 seconds)";

        //split
        String[] resultsArray = searchResults.split(" ");
         System.out.println("count = " + resultsArray.length);
        System.out.println(Arrays.toString(resultsArray));

        // number of results and total seconds
        String numberOfResults = resultsArray[1];
        System.out.println("numberOfResults = " + numberOfResults);

        String seconds = resultsArray[3].replace("(", "");
        System.out.println("seconds = " + seconds);

        System.out.println("-------------------");

        for(String each : resultsArray){
            System.out.println(each);
        }











    }
}
