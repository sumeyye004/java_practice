package week07;

import java.util.Scanner;

public class GiveMe$5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dollars = 0;
        int extra = 0;

        do {
            System.out.println("Give me $5");
            dollars = input.nextInt();
            if(dollars != 5){
                extra += dollars;
            }

        }while(dollars != 5);

            System.out.println("Thank you for $5");
            System.out.println("Please take back $" + extra);


    }
}
