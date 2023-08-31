package Exercise2;

import java.util.Scanner;

public class BasketballEquip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double AnnualPrice = Double.parseDouble(scanner.nextLine());

        double snikers = AnnualPrice - (AnnualPrice * 0.4);
        double shirts = snikers - (snikers * 0.2);
        double ball = shirts * 0.25;
        double access = ball * 0.2;

        double totalPrice = AnnualPrice + snikers + shirts + ball + access;

        System.out.println(totalPrice);
    }
}
