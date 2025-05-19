package week08;

public class CharAtMethod {

    public static void main(String[] args) {

                     //01
        String str1 = "hi";
        System.out.println(str1.length()); //2
        System.out.println("first char = " + str1.charAt(0));
        System.out.println("second char = " + str1.charAt(1));

        //System.out.println(str1.charAt(-2));

        System.out.println(str1.charAt(0) + " " + str1.charAt(1)); // h i

        String str2 = "hello world";
        System.out.println("first = " + str2.charAt(0)); //h
        System.out.println("fourth = " + str2.charAt(4)); //o
        System.out.println("space = " + str2.charAt(5));

        System.out.println("last = " + str2.charAt(str2.length()-1)); //d

        System.out.println("-------------charAt with a loop----------------");

        for (int i = 0; i < str2.length(); i++) {
            System.out.println(str2.charAt(i)); // i is changing from 0 to 10
        }

        System.out.println("--------------chaining methods----------------");
        System.out.println(str2.toUpperCase().charAt(0));

    }
}
