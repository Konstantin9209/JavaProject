package AdvancedConditionalStatements2;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int price = 0;

        if (day.equals("Monday") || (day.equals("Tuesday"))) {
            price = 12;
            System.out.println(price);
        } else if
            (day.equals("Wednesday") || (day.equals("Thursday"))) {
            price = 14;
            System.out.println(price);
        }else if
        (day.equals("Friday")){
            price = 12;
            System.out.println(price);
            } else {
        if (day.equals("Saturday") ||(day.equals("Sunday"))){
            price = 16;
            System.out.println(price);
            }
        }
    }
}
