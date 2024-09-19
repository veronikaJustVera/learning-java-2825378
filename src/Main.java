package src;

public class Main {

    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
        return result;
    }

    public static void main(String[] args) {
        int numberOfPeople = 5;
        double mealFinalPrice = calculateTotalMealPrice(100, .02, .08);
        System.out.println("Price per 1 person for company of " + numberOfPeople + " is " + mealFinalPrice / numberOfPeople);
    }

}
