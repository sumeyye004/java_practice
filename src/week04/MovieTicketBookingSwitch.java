package week04;

public class MovieTicketBookingSwitch {

    public static void main(String[] args) {

        int age = 1;

        String ageCategory;

        if(age < 0 || age > 150){
            System.err.println("Age should not be less then or greater then 150");
            System.exit(1);
        }

        if(age >=0 && age <= 2){
            ageCategory = "Infant";

        }else if(age >= 3 && age <= 12){
            ageCategory = "Kid";

        }else if(age >= 13 && age <= 20){
            ageCategory = "Teenager";

        }else if(age >= 21 && age <= 64){
            ageCategory = "Adult";

        }else{
            ageCategory = "Senior";

        }

        switch(ageCategory){
            case "Infant":
                System.out.println("Free tickets for infants");
                break;

            case "Kid":
            case "Teenager":
                System.out.println("The ticket price for your age is $8");
                break;

            case "Adult":
                System.out.println("The ticket price for your age is $12");
                break;

            case "Senior":
                System.out.println("The ticket price for your age is $10");
                break;
        }
    }

}
