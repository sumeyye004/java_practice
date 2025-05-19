package week06.methods_with_return;

public class AgeCalc {
    public static void main(String[] args) {

        System.out.println(getCurrentYear());

        int currentYear = getCurrentYear();
        System.out.println("currentYear = " + currentYear);

        System.out.println(getAge(2000));

        System.out.println(getAge(1990,2050));

        int birth = 1999;
        int year = 2025;
        System.out.println("she was born in " +birth + " and " + getAge(birth, year) + " years old in " + year);
    }

    /*
       getAge(1990, 2010)
     */
    public static int getAge(int birthYear, int anotherYear){

        return anotherYear - birthYear;
    }
    /*
       getAge(2000) => 24
     */
    public static int getAge(int birthYear){
        return getCurrentYear() - birthYear;
    }

    /*
      System.out.println(getCurrentYear()); -> 2024
     */

    public static int getCurrentYear(){
        return 2024;
    }
}
