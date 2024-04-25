import java.util.Scanner


/*
 * Task 4 : CurrencyConverter
 */

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Currency Selection
        System.out.println("Currency Converter");
        System.out.print("Enter the base currency (e.g., USD, EUR): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., USD, EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Amount Input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Fetch real-time exchange rates from an API (not implemented here)
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        // Currency Conversion
        double convertedAmount = amount * exchangeRate;

        // Display Result
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }

    // Method to fetch real-time exchange rates (not implemented here)
    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // This method should fetch the exchange rate from a reliable API
        // For demonstration purposes, let's assume a fixed exchange rate of 1.0 for demonstration purposes
        return 1.0;
    }
}
