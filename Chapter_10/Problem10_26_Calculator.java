// Problem 10.26
// Calculator accepting expressions with optional spaces
// Chapter_10

import java.util.Scanner;

public class Problem10_26_Calculator {
    public static double evaluate(String expr){
        expr = expr.trim();
        // find operator (+-*/)
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("([-+]?[0-9]*\.?[0-9]+)\\s*([+\-*/])\\s*([-+]?[0-9]*\.?[0-9]+)").matcher(expr);
        if(!m.find()) throw new IllegalArgumentException("Invalid expression");
        double a = Double.parseDouble(m.group(1)); char op = m.group(2).charAt(0); double b = Double.parseDouble(m.group(3));
        switch(op){ case '+': return a+b; case '-': return a-b; case '*': return a*b; case '/': return a/b; }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String line = in.nextLine();
        System.out.println(evaluate(line));
        in.close();
    }
}