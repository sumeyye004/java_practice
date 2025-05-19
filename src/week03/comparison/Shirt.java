package week03.comparison;

public class Shirt {

    public static void main(String[] args) {

        char size = 'L';
        String color = "blue";

        boolean wantToBuy = size == 'M' && (color == "blue" || color == "red");
        System.out.println("wantToBuy = " + wantToBuy);
    }
}
