package week10;

public class WrapperClasses {

    public static void main(String[] args) {

        //Integer class
        //max min methods

        System.out.println("max int = " + Integer.MAX_VALUE);
        System.out.println("min int = " + Integer.MIN_VALUE);

        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);

        //convert String to primitive
        String price = "13.25";
        Double price2 = Double.parseDouble(price);

        if (price2 > 0){
            System.out.println("price verification is passed" );
        }else{
            System.out.println("price verification FAILED!!!");
        }

        String str = "12345";
        Integer count = Integer.parseInt(str);
        count++;
        System.out.println("count = " + count);

        //Character class methods:

        char ch = 'A';
        System.out.println("isLetter = " + Character.isLetter(ch));
        System.out.println("isUppercase = " + Character.isUpperCase(ch));
        System.out.println("isLowercase = " + Character.isLowerCase(ch));
        System.out.println(Character.toLowerCase(ch));

        //create wrapper class object
        Integer n = Integer.valueOf(33);
        Double d = Double.valueOf(1.1);

        System.out.println("n = " + n);
        System.out.println("d = " + d);

        //auto-boxing -> converts from primitive to wrapper class object
        Integer myInt = 100;
        int ram = 6;
        Integer ram2 = ram;
        System.out.println("ram2 = " + ram2);

        double d1 = 2.5;
        Double d2 = d1;
        System.out.println("d2 = " + d2);

        //un-boxing -> converts from wrapper class object to primitive


    }
}
