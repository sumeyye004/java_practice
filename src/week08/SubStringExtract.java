package week08;

public class SubStringExtract {

    public static void main(String[] args) {

        String str = "Address=123 Main St East, NY";

        String address = str.substring(8);
        System.out.println("address = " + address);

        String address2 =  str.replace("Address=", "");
        System.out.println("address2 = " + address2);

        String address3 = str.substring(str.indexOf("=")+1);
        System.out.println(address3);

        String result = "16243 results";
        String count = result.substring(0, result.indexOf(" "));
        System.out.println("count = " + count);

    }
}
