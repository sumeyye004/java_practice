package week09;

public class DailySteps {

    public static void main(String[] args) {

        // array that holds the steps for a week
        int[] dailySteps = {3500, 6000, 5600, 7543, 12009, 11200, 15009};

        // array that stores the days
        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        // I walked 3532 steps on Monday
        System.out.println("I walked " + dailySteps[0] + " steps on " + days[0]);


        //get number of elements from both array
        System.out.println("dailySteps length = " + dailySteps.length);
        System.out.println("days length = " + days.length);

        System.out.println(dailySteps[0]);
        System.out.println(dailySteps[1]);
        System.out.println("last = " + dailySteps[dailySteps.length-1]);

        //looping array: for loop, for each loop
        for (int i = 0; i < dailySteps.length; i++) {
            System.out.println(dailySteps[i] + " => " + days[i]);
        }

        //total numbers of steps for whole week
        int totalSteps = dailySteps[0] + dailySteps[1] + dailySteps[2] + dailySteps[3] + dailySteps[4] + dailySteps[5] + dailySteps[6];
        System.out.println("totalSteps = " + totalSteps);

        //using for each loop / enhanced for loop
        int total = 0;
        for( int eachDay : dailySteps ){
            System.out.println("eachDay = " + eachDay);
            total += eachDay;
        }
        System.out.println("total = " + total);



    }
}
