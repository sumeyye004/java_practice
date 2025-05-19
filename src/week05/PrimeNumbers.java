package week05;
//prime number is only divisible by 1 and the number itself.

public class PrimeNumbers {

    public static void main(String[] args) {

       int num = 5;
       boolean isPrime = true;

        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(num + " is prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }
    }
}
