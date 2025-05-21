package practice_tasks.LoopsPractice;
/*

2. Create a class named EnglishAlphabets, and write a program that displays alphabet letters from A to Z in the
same line separated by a space.

 */
public class EnglishAlphabets {

    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z' ; ch++) {
            System.out.print(ch + " ");
        }
    }
}
