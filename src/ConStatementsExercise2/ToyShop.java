package ConStatementsExercise2;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice =puzzlesCount * 2.6;
        double dollsPrice = dolls * 3.0;
        double teddyBearsPrice = teddyBears *4.1;
        double minionsPrice = minions * 8.2;
        double trucksPrice = trucks * 2.0;

        int totalToys = puzzlesCount + dolls + teddyBears + minions + trucks;
        double totalProfit = puzzlePrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;
        if(totalToys >= 50) {
            totalProfit = totalProfit - (totalProfit * 0.25);
        }
        double profit = totalProfit - (totalProfit * 0.1);
        double diff = Math.abs(profit - holidayPrice);
        if (profit  >= holidayPrice) {

            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
