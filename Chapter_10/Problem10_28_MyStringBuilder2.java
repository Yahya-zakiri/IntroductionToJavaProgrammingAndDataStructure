// Problem 10.28
// MyStringBuilder2 implementation
// Chapter_10

public class Problem10_28_MyStringBuilder2 {
    public static class MyStringBuilder2 {
        private StringBuilder sb;

        public MyStringBuilder2() {
            sb = new StringBuilder();
        }

        public MyStringBuilder2(char[] chars) {
            sb = new StringBuilder();
            sb.append(chars);
        }

        public MyStringBuilder2(String s) {
            sb = new StringBuilder(s);
        }

        public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
            sb.insert(offset, s.sb);
            return this;
        }

        public MyStringBuilder2 reverse() {
            sb.reverse();
            return this;
        }

        public MyStringBuilder2 substring(int begin) {
            return new MyStringBuilder2(sb.substring(begin));
        }

        public MyStringBuilder2 toUpperCase() {
            String s = sb.toString().toUpperCase();
            sb = new StringBuilder(s);
            return this;
        }

        public String toString() {
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        MyStringBuilder2 s = new MyStringBuilder2("abc");
        s.insert(1, new MyStringBuilder2("X"));
        System.out.println(s);
    }
}