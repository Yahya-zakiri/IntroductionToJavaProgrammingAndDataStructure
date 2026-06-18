// Problem 10.23
// MyString2 implementation
// Chapter_10

public class Problem10_23_MyString2 {
    public static class MyString2 {
        private String s;

        public MyString2(String s) {
            this.s = s;
        }

        public int compare(String t) {
            return s.compareTo(t);
        }

        public MyString2 substring(int begin) {
            return new MyString2(s.substring(begin));
        }

        public MyString2 toUpperCase() {
            return new MyString2(s.toUpperCase());
        }

        public char[] toChars() {
            return s.toCharArray();
        }

        public static MyString2 valueOf(boolean b) {
            return new MyString2(String.valueOf(b));
        }

        public String toString() {
            return s;
        }
    }

    public static void main(String[] args) {
        MyString2 a = new MyString2("hello");
        System.out.println(a.toUpperCase());
    }
}