package week04;

public class MovieTicketBooking {

    public static void main(String[] args) {

        int age = 112;

        if(age < 0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }

        if(age >=0 && age <= 2){
            System.out.println("Free tickets for infants");

        }else if(age >= 3 && age <= 12){
            System.out.println("Kid: $8");

        }else if(age >= 13 && age <= 20){
            System.out.println("Teenager: $8");

        }else if(age >= 21 && age <= 64){
            System.out.println("Adult: $12");

        }else{
            System.out.println("Senior $10");
        }
    }
}
