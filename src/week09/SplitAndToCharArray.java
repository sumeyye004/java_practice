package week09;

import java.util.*;

public class SplitAndToCharArray {

    public static void main(String[] args) {

        String today = "Sunday";
        char[] letters = today.toCharArray();

        System.out.println("count = " + letters.length);
        System.out.println(Arrays.toString(letters));

        System.out.println("--------------------");

        //print each letter one by one
        for(char l : letters){
            System.out.println(l);
        }

        System.out.println("---------------------");

        //reverse
        for (int i = letters.length-1; i >= 0; i--){
            System.out.println(letters[i]);
        }

        System.out.println("-------------------------");

        //split
        String reports = "CF32;CF11;CF33;CF99";
        String[] allreports = reports.split(";");

        System.out.println("count = " + allreports.length);
        System.out.println(Arrays.toString(allreports));

        for (String report : allreports){
            System.out.println("Testing report #" + report);
            switch (report){
                case "CF32" -> {
                    // code to test case
                }
            }


        }
    }
}
