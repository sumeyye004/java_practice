package week05;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 10; // number of terms to print
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
