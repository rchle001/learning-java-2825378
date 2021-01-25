public class Main {

    public static void calculateTotalMealPrice(double ListedMealPrice, double TipRate, double TaxRate) {
        double tip = TipRate * ListedMealPrice;
        double tax = TaxRate * ListedMealPrice;
        double result = ListedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15, .2, .08);
        calculateTotalMealPrice(25, .18, .08);
    }

}
