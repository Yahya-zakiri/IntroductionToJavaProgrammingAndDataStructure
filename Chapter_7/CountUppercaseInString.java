//Chapter 7
//Programming exercises
//(Find number of uppercase letters in a string)

public class CountUppercaseInString {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java CountUppercaseInString \"Your string here\"");
            return;
        }
        String s = String.join(" ", args);
        int count = 0;
        for (char c : s.toCharArray())
            if (Character.isUpperCase(c))
                count++;
        System.out.println("Number of uppercase letters: " + count);
    }
}