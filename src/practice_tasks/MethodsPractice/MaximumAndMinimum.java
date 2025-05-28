package practice_tasks.MethodsPractice;

/*
3. Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100

 */
public class MaximumAndMinimum {

    public static void main(String[] args) {

        int maxInt = maximum(-1, 0);
        System.out.println("maxInt = " + maxInt);

        int minInt = minimum(31, 11);
        System.out.println("minInt = " + minInt);

        double maxDouble = maximum(3.6, 77.4);
        System.out.println("maxDouble = " + maxDouble);

        double minDouble = minimum(33.2, 3.2);
        System.out.println("minDouble = " + minDouble);

    }

    public static int maximum(int num1, int num2) {

            if (num1 > num2) {
                return num1;
            } else {
                return num2;
            }
        }



    public static int minimum(int num1, int num2){

        if(num1 < num2){
            return num1;

        }else{
            return num2;
        }
    }

    public static double maximum (double num1, double num2){

        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static double minimum(double num1, double num2){

        if(num1 < num2){
            return num1;

        }else{
            return num2;
        }
    }
}
