import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платёж за год");
        System.out.printf("%.2f", service.calculate(1_000_000, 12, 9.99));

        System.out.println();
        System.out.println("Ежемесячный платёж за два года");
        System.out.printf("%.2f", service.calculate(1_000_000, 24, 9.99));

        System.out.println();
        System.out.println("Ежемесячный платёж за три года");
        System.out.printf("%.2f", service.calculate(1_000_000, 36, 9.99));
    }
}