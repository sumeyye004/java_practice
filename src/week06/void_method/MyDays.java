package week06.void_method;

public class MyDays {

    public static void main(String[] args) {
        dailyRoutine("Monday");
        dailyRoutine("Friday");
    }

     /*
    dailyRoutine("Monday");
    dailyRoutine("Saturday");

    "Monday","Tuesday","Wednesday" -> makeCoffee,"java tasks for an hour", exercise for 20 mins,
                                    study java modules 2 hours, nap 25 mins
    "Thursday","Friday","Sunday" ->  makeCoffee, exercise for 30 mins, study soft skills for 2 hours
                                    makeCoffee, nap 10 mins
     "Saturday ->  makeCoffee, exercise 15 mins, live review session for 4 hours, make more coffee,
                -> nap 32 mins, study more live review session for 3 hours
     */
    public static void dailyRoutine(String day){

        System.out.println("-------" + day + "-------");
        switch (day){
            case "Monday", "Tuesday", "Wednesday" -> {
                MyDay.makeCoffee();
                MyDay.study("java tasks", 1);
                MyDay.exercise(20);
                MyDay.study("java modules", 2);
                MyDay.nap(25);
            }

            case "Thursday", "Friday", "Sunday" -> {
                MyDay.makeCoffee();
                MyDay.exercise(30);
                MyDay.study("soft skills", 2);
                MyDay.makeCoffee();
                MyDay.nap(10);
            }

            case "Saturday" -> {
                MyDay.makeCoffee();
                MyDay.exercise(15);
                MyDay.study("live review session", 4);
                MyDay.makeCoffee();
                MyDay.nap(32);
                MyDay.study("more live review session", 3);
            }

            default -> System.out.println("No such a day - " + day);
        }
    }
}
