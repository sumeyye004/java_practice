package week02.variables;

public class ItemPurpose {
    /*
    item = "computer", purpose = "coding"

    I use item for purpose
     */

    public static void main(String[] args) {

        String item = "computer" , purpose = "coding";
        System.out.println("I use " + item + " for " + purpose);

        // update item and purpose values and print same again:
        item = "car";
        purpose = "driver";
        System.out.println("I use " + item + " for " + purpose);

        // update item and purpose values and print same again:
        item = "home";
        purpose = "living";
        System.out.println("I use " + item + " for " + purpose);


    }
}
