package practice_tasks.MethodsPractice;
/*
1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
 */
public class OddAndEven {

    public static void main(String[] args) {

        boolean resultOdd = isOdd(233);
        System.out.println("resultOdd = " + resultOdd);

        boolean resultEven = isEven(301);
        System.out.println("resultEven = " + resultEven);

    }


    public static boolean isOdd(int num){

        if(num % 2 != 0) {
            return true;

        }else{
            return false;
        }

    }

    public static boolean isEven(int num){

        if (num % 2 == 0){
            return true;

        }else{
            return false;
        }
    }

}
