package Exam;
import java.util.Scanner;

public class Courier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double packageInKg = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distanceInKM = Integer.parseInt(scanner.nextLine());

        double pricePerKm = 0;
        double totalPrice = 0;
        double extraCharge= 0;
        double finalPrice;

        if (service.equals("standard")) {
            if (packageInKg < 1) {
                pricePerKm = 0.03;
            } else if (packageInKg <= 10) {
                pricePerKm = 0.05;
            } else if (packageInKg <= 40) {
                pricePerKm = 0.1;
            } else if (packageInKg <= 90) {
                pricePerKm = 0.15;
            } else {
                pricePerKm = 0.2;
            }
        } else {
            if (packageInKg < 1) {

                pricePerKm = 0.03 * 0.8;
            } else if (packageInKg <= 10) {
                pricePerKm = 0.05 * 0.4;
            } else if (packageInKg <= 40) {
                pricePerKm = 0.1 * 0.05;
            } else if (packageInKg <= 90) {
                extraCharge = pricePerKm +(0.15 * 0.02);
                finalPrice = totalPrice + extraCharge;
            } else {
                pricePerKm = 0.2 * 0.01;
            }
        }

        totalPrice = (pricePerKm * distanceInKM * packageInKg) + extraCharge;
        finalPrice = totalPrice + extraCharge;

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",
                packageInKg, totalPrice);
    }
}
