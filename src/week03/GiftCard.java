package week03;

public class GiftCard {
    /*
    GiftCard
        declare and assign a gift card with 200.0
        declare and assign String variable items and assign ""
        buy 2 items.
        buy item 1 for x price and subtract from your gift card,
            also add item name to items
        buy item 2 for x price and subtract from your gift card,
            also add item name to items
        print the remaining balance of your gift card and all items
     */
    public static void main(String[] args) {

        double giftCard = 200.0;

        String items = "Wooden Spoon";
        double price1 = 25.50;
        giftCard -= price1;

        items += ", Hat";
        double price2 = 50.25;
        giftCard -= price2;

        double remainingBalance = giftCard;
        System.out.println("Remaining balance = $" + remainingBalance);
        System.out.println("items = " + items);
    }
}
