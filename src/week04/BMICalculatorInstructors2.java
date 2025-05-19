package week04;

public class BMICalculatorInstructors2 {

    public static void main(String[] args) {

        //1.1 Define two variables within the class:
        double height = 1.75;
        double weight = 165;

        if(height > 0 && weight > 0){ // if the valid data are provided

            // 1.2 Calculate the BMI
            double BMI = weight / (height * height);

            String category;

            // 1.3 Define the BMI category
            if(BMI < 18.5){
                category = "Underweight";

            }else if(BMI < 25){
                category = "Normal weight";

            }else if(BMI < 30){
                category = "Over weight";
            }else{
                category = "Obesity";
            }

            //1.4 Display the result
            System.out.println("Your Body Mass Index (BMI): " + BMI + "\nCategory: " + category);

            switch (category) {


                case "Overweight":
                    System.out.println("Suggestion: Stick to your diet");
                    break;

                case "Obesity":
                    System.out.println("Suggestion: Stick to your diet and do more exercise");
                    break;

                case "Underweight":
                    System.out.println("Suggestion: Eat more food");
                    break;

            }


        }else{  // otherwise: Invalid data are provided
            System.err.println("Height and weight can't be negative or zero");
        }
    }
}
