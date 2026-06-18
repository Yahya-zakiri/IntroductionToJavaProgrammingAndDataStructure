// Problem 10.22
// MyString1 implementation
// Chapter_10

public class Problem10_22_MyString1 {
    public static class MyString1 {
        private char[] chars;

        public MyString1(char[] chars) {
            this.chars = new char[chars.length];
            System.arraycopy(chars, 0, this.chars, 0, chars.length);
        }

        public char charAt(int index) {
            return chars[index];
        }

        public int length() {
            return chars.length;
        }

        public MyString1 substring(int begin, int end) {
            char[] s = new char[end - begin];
            System.arraycopy(chars, begin, s, 0, end - begin);
            return new MyString1(s);
        }

        public MyString1 toLowerCase() {
            char[] s = new char[chars.length];
            for (int i = 0; i < chars.length; i++)
                s[i] = Character.toLowerCase(chars[i]);
            return new MyString1(s);
        }

        public boolean equals(MyString1 s) {
            if (s.length() != chars.length)
                return false;
            for (int i = 0; i < chars.length; i++)
                if (chars[i] != s.chars[i])
                    return false;
            return true;
        }

        public static MyString1 valueOf(int i) {
            return new MyString1(String.valueOf(i).toCharArray());
        }

        public String toString() {
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        MyString1 s = new MyString1(new char[] { 'H', 'e', 'l', 'l', 'o' });
        System.out.println(s.charAt(1));
        System.out.println(s.substring(1, 4).toString());
    }
}