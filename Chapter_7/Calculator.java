
//Chapter 7
//Case Study 7.13.2
//Listing 7.9

public class Calculator {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        int result = 0;
        int operand1 = Integer.parseInt(args[0]);
        int operand2 = Integer.parseInt(args[2]);

        switch (args[1].charAt(0)) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '.':
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Division by zero error");
                    System.exit(1);
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Invalid operator: " + args[1]);
                System.exit(1);
        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
