package AdvancedConditionalStatementsExercise2;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double boatRentPrice = 0.0;
        switch (season) {
            case "Spring":
                boatRentPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatRentPrice = 4200;
                break;
            case "Winter":
                boatRentPrice = 2600;
                break;
        }
        if (fisherman <= 6) {
            boatRentPrice = boatRentPrice - (boatRentPrice * 0.1);

        } else if (fisherman > 7 && fisherman <= 11) {
            boatRentPrice = boatRentPrice - (boatRentPrice * 0.15);

        } else if (fisherman > 12) {
            boatRentPrice = boatRentPrice - (boatRentPrice * 0.25);
        }
        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            boatRentPrice = boatRentPrice - (boatRentPrice * 0.05);
        }

        if (boatRentPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatRentPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatRentPrice - budget);
        }
    }


}