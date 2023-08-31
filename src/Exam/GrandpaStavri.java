package Exam;

import java.util.Scanner;

public class GrandpaStavri {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int days = Integer.parseInt(scanner.nextLine());

            double totalLiters = 0;
            double totalDegrees = 0;

            for (int i = 0; i < days; i++) {
                double liters = Double.parseDouble(scanner.nextLine());
                double degrees = Double.parseDouble(scanner.nextLine());

                totalLiters += liters;
                totalDegrees += liters * degrees;
            }

            double averageDegrees = totalDegrees / totalLiters;

            System.out.printf("Liter: %.2f%n", totalLiters);
            System.out.printf("Degrees: %.2f%n", averageDegrees);

            if (averageDegrees < 38) {
                System.out.println("Not good, you should baking!");
            } else if (averageDegrees >= 38 && averageDegrees <= 42) {
                System.out.println("Super!");
            } else {
                System.out.println("Dilution with distilled water!");
            }
        }
    }

