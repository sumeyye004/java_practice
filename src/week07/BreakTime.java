package week07;

import java.util.Scanner;

public class BreakTime {
    public static void main(String[] args) throws InterruptedException {

        //create Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("How long is the break");

        int minutes = input.nextInt();
        input.close();

        System.out.println("minutes = " + minutes);

        for (int mins = minutes-1; mins >= 0 ; mins--) {
            for (int seconds = 59; seconds >= 0 ; seconds--) {
                Thread.sleep(1000);
                System.out.println(mins + " minutes " + seconds + " seconds");
            }

        }

        System.out.println("BREAK TIME IS OVER, PLEASE COME BACK");
    }
}
