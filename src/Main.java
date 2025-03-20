import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Loan 2. Interest rate 3. n or morgage length
        Scanner scanner = new Scanner(System.in);

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annual_interest_rate = scanner.nextFloat();
        float monthly_interest = annual_interest_rate/PERCENTAGE/MONTH_IN_YEAR;

        System.out.print("Preiod: ");
        byte years = scanner.nextByte();
        int number_of_payment = years * MONTH_IN_YEAR;

        double mortgage = principle
                * (monthly_interest * Math.pow(1 + monthly_interest, number_of_payment))
                / (Math.pow(1 + monthly_interest, number_of_payment) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}