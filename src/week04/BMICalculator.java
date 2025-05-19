package week04;

public class BMICalculator {
    public static void main(String[] args) {

        double height = -1.75;
        double weight = 173.5;
        double BMI = weight / (height * height);

        boolean underWeight = BMI < 18.5;
        boolean normalWeight = 18.5 <= BMI && BMI < 25;
        boolean overWeight = 25 <= BMI && BMI < 30;
        boolean obesity = BMI >= 30;


        if (height <= 0 || weight <= 0) {
            System.err.println("It is not valid to give negative value!!!");
        } else {

            if (underWeight) {
                System.out.println("Your Body Mass Index: " + BMI);
                System.out.println("Category: Under Weight ");

            } else if (normalWeight) {
                System.out.println("Your Body Mass Index: " + BMI);
                System.out.println("Category: Normal Weight");

            } else if (overWeight) {
                System.out.println("Your Body Mass Index: " + BMI);
                System.out.println("Category: Over Weight");

            } else if (obesity) {
                System.out.println("Your Body Mass Index: " + BMI);
                System.out.println("Category: Obesity");
            }
        }
    }




}
