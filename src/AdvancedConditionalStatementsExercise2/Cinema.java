package AdvancedConditionalStatementsExercise2;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticketType = scanner.nextLine();
        int rowCount = Integer.parseInt(scanner.nextLine());
        int columnCount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (ticketType) {
            case "Premiere":
                price = rowCount * columnCount * 12.00;
                break;
            case "Normal":
                price = rowCount * columnCount * 7.50;
                break;
            case "Discount":
                price = rowCount * columnCount * 5.00;
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}