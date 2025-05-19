package week03.comparison;

public class LeapYear {
    /*
     1) A leap year is defined as a year that is divisible by 4 and not divisible by 100
     2) Or, years that are divisible by 400 are also considered leap years.
     */
    public static void main(String[] args) {

        int year = 4000;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("isLeapYear = " + isLeapYear);
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
