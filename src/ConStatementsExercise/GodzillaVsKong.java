package ConStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberStatists = Integer.parseInt(scanner.nextLine());
        double priceDress = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double allPriceDress = priceDress * numberStatists;
        if (numberStatists > 150) {
            allPriceDress = allPriceDress - (allPriceDress * 0.10);
        }
        double totalSum = allPriceDress + decor;

            if (totalSum > budget) {
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", totalSum - budget);
            } else {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
            }
        }
    }