package week04;

public class BMICalculator4 {

    public static void main(String[] args) {

        double height = 1.75,
                weight = 0;

        if(height <= 0 || weight <= 0){ // if either the height or the weight is invalid
            System.err.println("Height or weight can not be negative or zero");
            System.exit(1);  // terminates the whole program
        }

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
    }
}
