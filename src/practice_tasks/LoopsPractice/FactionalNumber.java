package practice_tasks.LoopsPractice;
/*
5. Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
public class FactionalNumber {

    public static void main(String[] args) {

        int num = 6;
        int facNum = 1;

        for (int i = 1; i <= num ; i++) {
            facNum *= i;
        }
        System.out.println(facNum);
    }
}
