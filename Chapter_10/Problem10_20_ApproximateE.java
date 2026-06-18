// Problem 10.20
// Approximate e using BigDecimal with 25-digit precision
// Chapter_10

import java.math.BigDecimal;
import java.math.MathContext;

public class Problem10_20_ApproximateE {
    public static BigDecimal computeE(int terms, MathContext mc) {
        BigDecimal sum = BigDecimal.ONE;
        BigDecimal term = BigDecimal.ONE;
        for (int i = 1; i <= terms; i++) {
            term = term.divide(BigDecimal.valueOf(i), mc);
            sum = sum.add(term);
        }
        return sum;
    }

    public static void main(String[] args) {
        MathContext mc = new MathContext(25);
        for (int i = 100; i <= 1000; i += 100) {
            System.out.println(i + ": " + computeE(i, mc));
        }
    }
}