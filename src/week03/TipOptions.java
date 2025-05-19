package week03;

public class TipOptions {
    /*
    TipOptions [variables, operators, concatenation]

        Declare and assign the following variables
            String food (list of all the food items),
            double item1Price, item2Price, item3Price
            double total (amount you owe) includes all item prices

        show the receipt of all the items and total cost of the bill
        then display 3 tip options and how much they would cost.
        show the tip for 10%, 18% and 25%
     */
    public static void main(String[] args) {

        String food = "Burger, Fries, Drink";
        double item1 = 7.50;
        double item2 = 3.20;
        double item3 = 2.50;

        double totalPrice = item1+item2+item3;

        System.out.println("Your order: " + food);
        System.out.println("Total price: $" + totalPrice);

        System.out.println("Select one of the tip options: ");
        System.out.println("10% = $" + totalPrice * 0.10);
        System.out.println("18% = $" + totalPrice * 0.18);
        System.out.println("25% = $" + totalPrice * 0.25);
    }
}
