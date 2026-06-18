// Problem 10.24
// MyCharacter implementation
// Chapter_10

public class Problem10_24_MyCharacter {
    public static class MyCharacter {
        private char c;

        public MyCharacter(char c) {
            this.c = c;
        }

        public static boolean isLetter(char c) {
            return Character.isLetter(c);
        }

        public static boolean isDigit(char c) {
            return Character.isDigit(c);
        }

        public static char toUpperCase(char c) {
            return Character.toUpperCase(c);
        }

        public static char toLowerCase(char c) {
            return Character.toLowerCase(c);
        }

        public char charValue() {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(MyCharacter.isLetter('A'));
    }
}