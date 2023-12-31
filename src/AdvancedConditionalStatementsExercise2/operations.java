package AdvancedConditionalStatementsExercise2;
import java.util.Scanner;
public class operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        String evenOrOdd = "";
        boolean isZero = false;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    isZero = true;
                } else {
                    result = num1 * 1.0 / num2;
                }
                break;
            case "%":
                if (num2 == 0) {
                    isZero = true;
                } else {
                    result = num1 % num2;
                }
                break;
        }

        if (isZero) {
            System.out.printf("Cannot divide %d by zero", num1);
        } else if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, evenOrOdd);
        } else if (operator.equals("/")) {
            System.out.printf("%d / %d = %.2f", num1, num2, result);
        } else if (operator.equals("%")) {
            System.out.printf("%d %% %d = %.0f", num1, num2, result);
        }
    }
}

