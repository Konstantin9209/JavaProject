package ConStatementsExercise;

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

        double puzzlePrice = puzzlesCount * 2.60;
        double dollsPrice = dolls * 3;
        double teddyBearPrice = teddyBears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;

        double profit = puzzlePrice + dollsPrice + teddyBearPrice + minionsPrice + trucksPrice;
        int totalToys = puzzlesCount + dolls + teddyBears + minions + trucks;

        if (totalToys >= 50) {
            profit = profit - (profit * 0.25);
        }
        double totalProf = profit - (profit * 0.10);
        double diff =Math.abs(totalProf - holidayPrice);
        if (totalProf >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf(" Not enough money! %.2f lv needed.", diff);
        }
    }
}
