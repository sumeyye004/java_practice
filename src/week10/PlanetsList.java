package week10;

import java.util.*;

public class PlanetsList {

    public static void main(String[] args) {

        //Create arraylist and add planet names in solar system:
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Earth", "Mercury", "Venus", "Mars" ,"Jupiter","Pluto","Saturn","Neptune","Uranus"));

        System.out.println("planets = " + planets);

        System.out.println();

        //print each planet in uppercase letter:
        for (String planet : planets) {
            System.out.println(planet.toUpperCase() + " ");
        }

        System.out.println();

        //print each planet in reverse order in the same line
        for (int i = planets.size()-1; i >= 0; i--){
            System.out.print(planets.get(i) + " ");
        }

        System.out.println();

        System.out.println("-----------FOR EACH METHOD---------------");
        planets.forEach(p -> System.out.println(p + " - " + p.length()));

        //Collections class
        //reverse
        Collections.reverse(planets);
        System.out.println("After reversing = " + planets);

        System.out.println(Collections.min(planets));
        System.out.println(Collections.max(planets));

        Collections.sort(planets);
        System.out.println("After sort = " + planets);

        Collections.shuffle(planets);
        System.out.println("After shuffle = " + planets);

        int count = Collections.frequency(planets, "Earth");
        System.out.println("count = " + count);

        //other list useful methods:
        System.out.println("index of Pluto = " + planets.indexOf("Pluto"));
        System.out.println("contains Venus = " + planets.contains("Venus"));


        ArrayList<String> anotherPlanet = new ArrayList<>();
        anotherPlanet.add("Earth");
        anotherPlanet.add("Mercury");

        System.out.println("containsAll = " + planets.containsAll(anotherPlanet));







    }





}
