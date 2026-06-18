// Problem 10.27
// MyStringBuilder1 implementation
// Chapter_10

public class Problem10_27_MyStringBuilder1 {
    public static class MyStringBuilder1 {
        private StringBuilder sb;

        public MyStringBuilder1(String s) {
            sb = new StringBuilder(s);
        }

        public MyStringBuilder1 append(MyStringBuilder1 s) {
            sb.append(s.sb);
            return this;
        }

        public MyStringBuilder1 append(int i) {
            sb.append(i);
            return this;
        }

        public int length() {
            return sb.length();
        }

        public char charAt(int index) {
            return sb.charAt(index);
        }

        public MyStringBuilder1 toLowerCase() {
            String s = sb.toString().toLowerCase();
            sb = new StringBuilder(s);
            return this;
        }

        public MyStringBuilder1 substring(int begin, int end) {
            return new MyStringBuilder1(sb.substring(begin, end));
        }

        public String toString() {
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        MyStringBuilder1 s = new MyStringBuilder1("Hello");
        s.append(123);
        System.out.println(s.toString());
    }
}