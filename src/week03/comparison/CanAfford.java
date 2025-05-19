package week03.comparison;

public class CanAfford {

    public static void main(String[] args) {
        //money, itemPrice
        double money = 35.50;
        double itemPrice = 23.25;

        System.out.println(money >= itemPrice);
        boolean canBuy = money >= itemPrice;
        System.out.println("canBuy = " + canBuy);


    }
}
