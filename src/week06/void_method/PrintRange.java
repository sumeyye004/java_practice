package week06.void_method;

public class PrintRange {

    public static void main(String[] args) {

        printRange(1, 7);
        printRange(60, 110);

        printRange('A', 'T');
        printRange('U', 'p');

        multiplicationTable(5);
        multiplicationTable(7);

        multiplicationTable();

        for (int i = 1; i <= 10 ; i++) {
            multiplicationTable();
        }
    }

    /*
       multiplication()   of all numbers
     */
    public static void multiplicationTable(){

        for (int number = 1; number <= 10 ; number++) {
            for (int i = 1; i <= 10 ; i++) {
                System.out.print(i + " x " + number + " = " + (number*i)+ "\t\t");
            }
            System.out.println();
        }
    }
    /*
       multiplicationTable(5);
     */
    public static void multiplicationTable(int num) {

        System.out.println("--------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("-----------------------");
    }
    /*
        printRange(1, 7) -> 1 2 3 4 5 6 7
        printRange(6, 11) -> 6 7 8 9 10
     */

    public static void printRange(int num1, int num2) {

        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
         printRange('A', 'T');
     */

    public static void printRange(char start, char end) {
        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
