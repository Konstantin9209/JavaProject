package Exercise2;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int depositInMonths = Integer.parseInt(scanner.nextLine());
        double annualPercent = Double.parseDouble(scanner.nextLine());

        double sum = deposit + depositInMonths * ((deposit * annualPercent/ 100) / 12);

        System.out.println(sum);

    }
}
