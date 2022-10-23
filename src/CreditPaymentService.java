import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(int creditAmount, int monthsAmount, double interestRate) {
        double percentPerMonth = (interestRate / 12) / 100;
        double prepareToExponent = 1 + percentPerMonth;
        double monthsPayment = (creditAmount * (percentPerMonth * pow(prepareToExponent, monthsAmount)) / (pow(prepareToExponent, monthsAmount) - 1));
        return monthsPayment;
    }
}