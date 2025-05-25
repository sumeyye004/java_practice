package week09;
/*
    - Find and print all the first and last characters

    - Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'
 */

import java.util.*;

public class Countries {

    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        //- Find and print all the first and last characters
        for(String eachCountry : countries){
            System.out.println(eachCountry.charAt(0) + "" + eachCountry.charAt(eachCountry.length()-1));
            System.out.println(eachCountry.substring(0,1) + eachCountry.substring(eachCountry.length()-1));

        }

        //- Find the largest and smaller countries based on the length of their names
        //sort the countries by their length:
        System.out.println("-----------------------------------");

        Arrays.sort(countries, Comparator.comparingInt(String :: length));
        System.out.println(Arrays.toString(countries));

        System.out.println("smallest = " + countries[0]);
        System.out.println("largest = " + countries[countries.length-1]);

        //- Show all the countries that start with a 'C'
        System.out.println("------------------");
        for(String each : countries){
            if (each.startsWith("C")){
                System.out.println(each);
            }
        }


        //- Show all the countries that end with an 's'
        System.out.println("------------------");
        for(String each : countries){
            if (each.endsWith("s")){
                System.out.println(each);
            }


            if (each.charAt(each.length()-1) == 's'){
                System.out.println(each);
            }

            if (each.substring(each.length()-1).equals("s")){
                System.out.println(each);
            }


        }

    }
}
