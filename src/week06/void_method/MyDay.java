package week06.void_method;

public class MyDay {

    public static void main(String[] args) {
        makeCoffee();
        exercise(40);
        study("java", 2);
        study("softskills", 1);
        nap(20);
    }
    /*
    method name: makeCoffee
    no params
    return: void
    prints "Making strong coffee..."
   */

    public static void makeCoffee(){
        System.out.println("Making strong coffee...");
    }

    /*
    Method name: exercise
    param: minutes
    return: void
    prints "Exercising for minutes minutes..."
     */

    public static void exercise(int minutes){
        System.out.println("Exercising for " + minutes + " minutes...");
    }

    /*
    study("java", 2)
    study("softskills", 1)
     */

    public static void study(String topic, int hours){

        System.out.println("Studying " + topic + " for " + hours + " hours...");

    }


    /*
       nap(30);
       nap(5);
       nap(55);
       minutes <= 10 -> short nap for 10 minutes
       minutes <= 30 -> moderate nap for ... minutes
       minutes <= 60 -> long nap for ... minutes
       --> wake up and code java, its been ... minutes
     */

    public static void nap(int minutes){

        if(minutes <= 10){
            System.out.println("short nap for " + minutes +" minutes...");
        }else if(minutes <= 30){
            System.out.println("moderate nap for " + minutes + " minutes...");
        }else if(minutes <= 60){
            System.out.println("long nap for " + minutes + " minutes...");
        }else {
            System.out.println("wake up and code java, it's been " + minutes + " minutes...");
        }
    }


}
