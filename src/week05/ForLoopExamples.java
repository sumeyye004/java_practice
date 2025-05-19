package week05;

public class ForLoopExamples {

    public static void main(String[] args) {

        //print "Hello" 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello jeni");
        }

        System.out.println("--------------------");

        //print hi 5 times. with number
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi - " + i);
        }

        System.out.println("--------------------");
        //print bye with number 6 to 0
        for (int i = 6; i >= 0; i--) {
            System.out.println("bye - " + i);
        }


        System.out.println("--------------------");
        //loop from to 1 to 1_000_000, ->print heart beat - number. every thousand
        for (int i=1; i<=1_000_000; i++){

            if (i % 1000 == 0){
                System.out.println("Heart beat - " + i);
            }
        }

    }
}
