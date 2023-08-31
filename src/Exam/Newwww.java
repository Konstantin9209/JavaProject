package Exam;
import java.util.Scanner;

public class Newwww {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double pricePerKm = 0;
        double totalPrice = 0;

        switch (serviceType) {
            case "standard":
                if (weight < 1) {
                    pricePerKm = 0.03;
                } else if (weight <= 10) {
                    pricePerKm = 0.05;
                } else if (weight <= 40) {
                    pricePerKm = 0.10;
                } else if (weight <= 90) {
                    pricePerKm = 0.15;
                } else {
                    pricePerKm = 0.20;
                }
                break;

            case "express":
                if (weight < 1) {
                    pricePerKm = 0.03 * 0.80;
                } else if (weight <= 10) {
                    pricePerKm = 0.05 * 0.40;
                } else if (weight <= 40) {
                    pricePerKm = 0.10 * 0.05;
                } else if (weight <= 90) {
                    pricePerKm = 0.15 * 0.02;
                } else {
                    pricePerKm = 0.20 * 0.01;
                }
                break;

            default:
                System.out.println("Invalid service type.");
                return;
        }

        totalPrice = distance * pricePerKm;
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, totalPrice);
    }
}
