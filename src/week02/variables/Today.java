package week02.variables;
/*
    year = 2024
    month = October
    day = 12
    weekday = Saturday
    hour = 4
    minute = 36

    Saturday, October 12 - 4:36 PM EST
 */
public class Today {

    public static void main(String[] args) {

        int year = 2024;
        String month = "October";
        byte day = 12;
        String weekday = "Saturday";
        byte hour = 4 , minute = 36;

        System.out.println(weekday + ", " + month + " " + day + " - " + hour + ":" + minute + " PM EST");
    }
}
