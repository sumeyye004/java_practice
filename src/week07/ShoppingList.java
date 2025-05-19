package week07;

import java.util.Scanner;
/*
ShoppingList

What is item name?
apples
How much are apples?
5
Do you want to add more items?
yes

What is item name?
grapes
How much are apples?
4
Do you want to add more items?
No

All items = apples, grapes
TotalPrice = $9
 */

public class ShoppingList {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String allItems = "";
        String answers = "";
        double totalPrice = 0.0;

        do {
            System.out.println("What is item name");
            String item = scn.nextLine();
            allItems += item + ", ";

            System.out.println("How much is " + item);
            double itemPrice = scn.nextDouble();
            totalPrice += itemPrice;
            scn.nextLine();

            System.out.println("Do you want to add more items");
            answers = scn.nextLine();

        }while(answers.equals("yes"));

        System.out.println("allItems = " + allItems);
        System.out.println("totalPrice = " + totalPrice);

    }
}
