package week05;

import java.lang.reflect.Array;

public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("---------------------------------------------");

        //multiplication table for all numbers 1 to 10

        for (int number = 1; number <= 10; number++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " x " + number + " = " + (number * i) + "\t\t");
            }

            System.out.println();
        }
    }
}
