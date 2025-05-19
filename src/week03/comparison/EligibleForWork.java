package week03.comparison;
/*
   Eligible for work
   age between 18 and 65 is eligible for work
 */
public class EligibleForWork {

    public static void main(String[] args) {
        int age = 25;

        if(age>=18 && age<=65){
            boolean isEligible = age>=18 && age<=65;
            System.out.println("Am i eligible to work -" + isEligible);
        }else{
            System.out.println("Is not eligible for work");
        }

    }
}
