package week02.variables;

public class WholeNumbers {

    public static void main(String[] args){

        //declare students variable
        int students;

        //assign 111 to students. Initialize students variable with 111
        students = 111;
        System.out.println(students);

        //declare and initialize teachers variable with value 3
        int teachers = 3;
        System.out.println(teachers);

        //byte, short, int, long
        byte n1 = 100;
        short n2 = 31000;
        int n3 = 43_543_432;
        long n4 = 342546476346224L;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        byte screenSize = 15;
        System.out.println(screenSize);
        //change the value to 12
        screenSize = 12;
        System.out.println(screenSize);

        int apples = 20;
        apples = 25;
        System.out.println(apples);//25

        apples = 35;
        System.out.println(apples);//35

        int count = 6;
        int bananas = count; // copy count value to bananas variable
        System.out.println(bananas);
        System.out.println(count);

    }
}
