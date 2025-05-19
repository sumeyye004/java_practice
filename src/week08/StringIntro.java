package week08;

public class StringIntro {

    public static void main(String[] args) {

        //creating String objects:

        String str = "java string review"; // string pool
        String str2 = new String("java string review"); // outside string pool

        System.out.println(str == str2); //false. They are pointing to different objects in memory
        System.out.println(str.equals(str2)); //true

        String str3 = "JAVA";
        String str4 = "java";
        System.out.println(str3 == str4);//false. cause of case-sensitive

        System.out.println(str3.equals(str4)); //false. case difference

        System.out.println(str3.equalsIgnoreCase(str4)); //true, ignoring case

        System.out.println("abc".equals("abcd")); //false. everything has to be fully matched

        System.out.println("apples".equalsIgnoreCase("Apples")); //true

        //length of characters
        System.out.println(str.length()); // 18
        System.out.println("python".length()); //6

        int len = str4.length();
        System.out.println("len = " + len);

        //case updates:
        String name = "Esat";
        System.out.println(name.toUpperCase());
        name.toUpperCase();  // it won't print in upper case cause we haven't assign it
        System.out.println("name = " + name); // Esat

        String day = "SATURDAY";
        System.out.println(day);
        System.out.println(day.toLowerCase());
        System.out.println("day = " + day); //it isn't change cause we haven't assign it

        day = day.toLowerCase();
        System.out.println("day = " + day); // saturday

        String pet = "cat";
        System.out.println(pet.toUpperCase().equals("CAT"));

        // method chaining
        System.out.println("string manipulation".toUpperCase().length());

        System.out.println("CODING".toLowerCase().equals("CODING")); //false





    }
}
