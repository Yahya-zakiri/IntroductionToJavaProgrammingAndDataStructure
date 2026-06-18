// Problem 10.8
// Tax class
// Chapter_10

public class Problem10_8_Tax {
    public static class Tax {
        public static final int SINGLE = 0, MARRIED_JOINT = 1, MARRIED_SEPARATE = 2, HEAD = 3;
        private int filingStatus;
        private int[][] brackets;
        private double[] rates;
        private double taxableIncome;

        public Tax() {
        }

        public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
            this.filingStatus = filingStatus;
            this.brackets = brackets;
            this.rates = rates;
            this.taxableIncome = taxableIncome;
        }

        public double getTax() {
            double tax = 0;
            int[] b = brackets[filingStatus];
            double income = taxableIncome;
            if (income <= b[0])
                return income * rates[0];
            tax += b[0] * rates[0];
            for (int i = 1; i < b.length; i++) {
                if (income <= b[i]) {
                    tax += (income - b[i - 1]) * rates[i];
                    return tax;
                } else
                    tax += (b[i] - b[i - 1]) * rates[i];
            }
            tax += (income - b[b.length - 1]) * rates[rates.length - 1];
            return tax;
        }

        public int getFilingStatus() {
            return filingStatus;
        }

        public void setFilingStatus(int s) {
            filingStatus = s;
        }

        public void setTaxableIncome(double t) {
            taxableIncome = t;
        }
    }

    public static void main(String[] args) {
        // simple smoke test
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, { 16700, 67900, 137050, 208850, 372950 },
                { 8350, 33950, 68525, 104425, 186475 }, { 11950, 45500, 117450, 190200, 372950 } };
        Tax t = new Tax(0, brackets, rates, 400000);
        System.out.printf("Tax = %.2f\n", t.getTax());
    }
}