package Exam;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paper = Integer.parseInt(scanner.nextLine());
        int fabric = Integer.parseInt(scanner.nextLine());
        double adhesive = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double paperPrice = paper * 5.8;
        double fabricPrice = fabric * 7.2;
        double adhesivePrice = adhesive * 1.2;

        double totalAmount = paperPrice + fabricPrice + adhesivePrice;
        double discountPrice = totalAmount * discount / 100;
        double finalMoney = totalAmount - discountPrice;

        System.out.printf("%.3f", finalMoney);


    }
}
