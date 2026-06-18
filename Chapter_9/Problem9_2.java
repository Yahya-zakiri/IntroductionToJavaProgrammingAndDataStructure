// Problem 9.2
// Stock class
// Chapter_9

public class Problem9_2 {
    public static class Stock {
        private String symbol;
        private String name;
        private double previousClosingPrice;
        private double currentPrice;

        public Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public String getName() {
            return name;
        }

        public double getPreviousClosingPrice() {
            return previousClosingPrice;
        }

        public void setPreviousClosingPrice(double p) {
            previousClosingPrice = p;
        }

        public double getCurrentPrice() {
            return currentPrice;
        }

        public void setCurrentPrice(double p) {
            currentPrice = p;
        }

        public double getChangePercent() {
            return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
        }
    }

    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(34.35);
        System.out.printf("Price-change percentage is %.2f%%%n", s.getChangePercent());
    }
}