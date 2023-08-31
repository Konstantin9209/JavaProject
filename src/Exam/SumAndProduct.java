package Exam;
import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean combination = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int sum = a + b + c + d;
                        int product = a * b * c * d;

                        if (sum == product && n % 10 == 5) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            combination = true;
                            break;
                        }

                        if (product / sum == 3 && n % 3 == 0) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            combination = true;
                            break;
                        }
                    }
                    if (combination) {
                        break;
                    }
                }
                if (combination) {
                    break;
                }
            }
            if (combination) {
                break;
            }
        }

        if (!combination) {
            System.out.println("Nothing found");
        }
    }
}
