package week03.comparison;

public class Driving {

    public static void main(String[] args) {

        System.out.println(true || true);   //true
        System.out.println(true || false);  //true
        System.out.println(false || false); //false

        int num = 5;
        System.out.println(num == 5 || num == 6); //true
        System.out.println(num == 5 && num == 6); //false

        double age = 15.5;
        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;

        System.out.println(age >= 15.5 && hasLearningPermit);
        System.out.println(age <= 18 && hasDriverLicense);

        boolean allowedToDrive = (age >= 15.5 && hasLearningPermit) || (age <= 18 && hasDriverLicense);
        System.out.println("allowedToDrive = " + allowedToDrive);
    }
}
