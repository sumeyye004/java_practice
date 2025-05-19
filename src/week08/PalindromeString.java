package week08;

public class PalindromeString {

    public static void main(String[] args) {

        System.out.println(isPalindrome("dad"));
        System.out.println(isPalindrome("race car"));
        System.out.println(isPalindrome("Civic"));
        System.out.println(isPalindrome("Nurses run"));
        System.out.println(isPalindrome("jump"));
        System.out.println(isPalindrome("w"));

        System.out.println("----------V2 with StringBuilder------------");

        System.out.println(isPalindromeV2("dad"));
        System.out.println(isPalindromeV2("race car"));
        System.out.println(isPalindromeV2("Civic"));
        System.out.println(isPalindromeV2("Nurses run"));
        System.out.println(isPalindromeV2("jump"));
        System.out.println(isPalindromeV2("w"));
    }
    /*
    checks if str is palindrome and returns boolean
    isPalindrome("dad") => true
    isPalindrome("race car") => true
    isPalindrome("Civic") => true
    isPalindrome("java") => false
     */
    public static boolean isPalindrome(String str){

        str = str.replace(" ", ""); // removes the space

        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        return str.equalsIgnoreCase(reverse);
    }

    public static boolean isPalindromeV2(String str){
        str = str.replace(" ", "");

        StringBuffer stb = new StringBuffer(str);
        return stb.reverse().toString().equalsIgnoreCase(str);
    }
}
