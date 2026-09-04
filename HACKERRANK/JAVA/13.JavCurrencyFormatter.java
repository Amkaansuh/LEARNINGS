import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;

public class JavCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        NumberFormat formatter = NumberFormat.getInstance();
        System.out.println("US: "+formatter.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: Rs."+decimalFormat.format(payment));
        System.out.println("China: "+formatter.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: "+formatter.getCurrencyInstance(Locale.FRANCE).format(payment));

    }
}