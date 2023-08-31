package AdvancedConditionalStatements2;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int price = Integer.parseInt(scanner.nextLine());

        if (day.equals("Monday")) {

            if (price >= 100) {
                System.out.println("you will get 20% discount");
            } else {
                System.out.println("you only get a discount on price bigger than 100lv");
            }
        } else {
            System.out.println("you would not get a discount");

        }
    }
}