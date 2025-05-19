package week03;
/*
    Program to calculate Body Mass Index
    Formula metric system => BMI = weight / (height * height)

    1. Declare and initialize double weight and height variables
    2. Calculate BMI value using above formula and assign to double BMI variable
    3. Print out the result as below format:
    The Body Mass Index (BMI) is 33.333333333333336 kg/m2
 */
public class BMICalculator {

    public static void main(String[] args) {

        double weight = 75;
        double height = 2.0;

        double BMI = weight / (height * height);

        System.out.println("The Body Mass Index (BMI) is " +  BMI + " kg/m2");
    }
}
