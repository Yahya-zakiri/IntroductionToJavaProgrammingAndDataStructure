// Problem12_1
// Chapter 12 - Exercise 12.1
// Calculator with exception-handling and validation

import java.util.regex.Pattern;

public class Problem12_1 {
    public static void main(String[] args) {
        // Exception-handling version
        if (args.length == 3) {
            try {
                double op1 = Double.parseDouble(args[0]);
                String operator = args[1];
                double op2 = Double.parseDouble(args[2]);
                System.out.println(calc(op1, operator, op2));
            } catch (NumberFormatException ex) {
                System.out.println("Wrong operand type");
            }
        } else {
            System.out.println("Usage: java Problem12_1 operand1 operator operand2");
            System.out.println("Example: java Problem12_1 2.5 + 3");
        }
    }

    private static double calc(double a, String op, double b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operator");
        }
    }
}

class Problem12_1_NoException {
    // No exception handler: validate operands before parsing
    private static final Pattern DOUBLE = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");

    public static void main(String[] args) {
        if (args.length == 3) {
            if (!isNumeric(args[0]) || !isNumeric(args[2])) {
                System.out.println("Wrong operand type");
                return;
            }
            double op1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double op2 = Double.parseDouble(args[2]);
            System.out.println(calc(op1, operator, op2));
        } else {
            System.out.println("Usage: java Problem12_1_NoException operand1 operator operand2");
        }
    }

    private static boolean isNumeric(String s) {
        return DOUBLE.matcher(s).matches();
    }

    private static double calc(double a, String op, double b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operator");
        }
    }
}
