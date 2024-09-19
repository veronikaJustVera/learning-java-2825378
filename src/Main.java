package src;

public class Main {

    public static void calculateTotalMealPrice(double totalMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * totalMealPrice;
        double tax = taxRate * totalMealPrice;
        double result = totalMealPrice + tip + tax;
        System.out.println("Total meal price: " + result + "$");
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(10, 0.1, 0.2);
    }

}
