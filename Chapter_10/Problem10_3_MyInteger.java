// Problem 10.3
// MyInteger class
// Chapter_10

public class Problem10_3_MyInteger {
    public static class MyInteger {
        private int value;

        public MyInteger(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public boolean isEven() {
            return isEven(value);
        }

        public boolean isOdd() {
            return isOdd(value);
        }

        public boolean isPrime() {
            return isPrime(value);
        }

        public static boolean isEven(int v) {
            return v % 2 == 0;
        }

        public static boolean isOdd(int v) {
            return v % 2 != 0;
        }

        public static boolean isPrime(int v) {
            if (v <= 1)
                return false;
            if (v == 2)
                return true;
            if (v % 2 == 0)
                return false;
            for (int i = 3; i <= Math.sqrt(v); i += 2)
                if (v % i == 0)
                    return false;
            return true;
        }

        public static boolean isEven(MyInteger m) {
            return isEven(m.value);
        }

        public static boolean isOdd(MyInteger m) {
            return isOdd(m.value);
        }

        public static boolean isPrime(MyInteger m) {
            return isPrime(m.value);
        }

        public boolean equals(int v) {
            return value == v;
        }

        public boolean equals(MyInteger m) {
            return value == m.value;
        }

        public static int parseInt(char[] chars) {
            int v = 0;
            for (char c : chars)
                v = v * 10 + (c - '0');
            return v;
        }

        public static int parseInt(String s) {
            return Integer.parseInt(s);
        }
    }

    public static void main(String[] args) {
        MyInteger m = new MyInteger(17);
        System.out.println("isPrime: " + m.isPrime());
        System.out.println("isEven: " + MyInteger.isEven(10));
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(new char[] { '1', '2', '3' }));
    }
}