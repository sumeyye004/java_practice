package week06.methods_with_return;

public class Currency {

    public static void main(String[] args) {

        System.out.println(convertDollars("EUR", 100));
        System.out.println("50 USD to JPY => " + convertDollars("JPY", 50));

        double tryAmount = convertDollars("TRY", 10);
        System.out.println("tryAmount = " + tryAmount);

        if (convertDollars("WWW", 20) == 0.0) {
            System.out.println("WWW conversion is not available");
        }

        System.out.println(convertDollarsV2("EUR", 45));
        System.out.println(convertDollarsV2("KRW", 45));
        System.out.println(convertDollarsV2("PKR", 5));

    }

    /*
            Use the following sample rates for currency conversions
        •	1 USD = 0.93 EUR
        •	1 USD = 152.87 JPY
        •	1 USD = 34.35 TRY
        •	1 USD = 1,386.05 KRW
        •	1 USD = 84.29 INR

        convertDollars("EUR", 100); ->
         */
    public static double convertDollars(String currency, double USDAmount) {

        return switch (currency) {
            case "EUR" -> USDAmount * 0.93;
            case "JPY" -> USDAmount * 152.87;
            case "TRY" -> USDAmount * 34.35;
            case "KRW" -> USDAmount * 1386.05;
            case "INR" -> USDAmount * 84.29;
            default -> 0.0;
        };

    }

    public static double convertDollarsV2(String currency, double USDAmount) {
        double result = 0.0;

        switch (currency) {
            case "EUR" -> result = USDAmount * 0.93;
            case "JPY" -> result = USDAmount * 152.87;
            case "TRY" -> result = USDAmount * 34.35;
            case "KRW" -> result = USDAmount * 1386.05;
            case "INR" -> result = USDAmount * 84.29;
            default -> {
                System.out.println(currency + " is not available");
                result = 0.0;
            }
        }

        System.out.println(USDAmount + " USD to " + currency);
        return result;
    }



}
