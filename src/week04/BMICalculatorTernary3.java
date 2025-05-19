package week04;

public class BMICalculatorTernary3 {

    public static void main(String[] args) {

        //1.1 Define two variables within the class:
        double height = 1.75;
        double weight = 165;


        if(height > 0 && weight > 0){

        double BMI = weight / (height * height);

        String category = (BMI < 18.5) ? "Underweight" : (BMI < 25) ? "Normal weight"
                           : (BMI < 30) ? "Overweight" : "Obesity";

            //1.4 Display the result
            System.out.println("Your Body Mass Index (BMI): " + BMI + "\nCategory: " + category);

        }else{  // otherwise: Invalid data are provided
            System.err.println("Height and weight can't be negative or zero");

        }

    }

}
