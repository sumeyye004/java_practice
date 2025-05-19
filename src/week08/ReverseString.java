package week08;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reversed("python"));
        System.out.println("Selenium");

        StringBuilder stb = new StringBuilder("Java SDET");
        System.out.println(stb.reverse());
    }

        /*
        method accepts a String and returns reversed String
        reverse("java") -> "avaj"
         */

      public static String reversed(String str){

          String reversed = "";
          for (int i = str.length()-1; i >= 0 ; i--) {
              reversed += str.charAt(i);

          }
          return reversed;
      }
}
